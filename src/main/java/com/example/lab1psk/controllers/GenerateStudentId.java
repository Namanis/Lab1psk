package com.example.lab1psk.controllers;




import com.example.lab1psk.interceptors.LoggedInvocation;
import lombok.Getter;
import lombok.Setter;
import com.example.lab1psk.entities.Student;
import com.example.lab1psk.services.StudentPersonalIdGenerator;
import com.example.lab1psk.services.StudentServiceImpl;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@SessionScoped
@Named
public class GenerateStudentId implements Serializable {
    @Inject
    private StudentPersonalIdGenerator studentPersonalIdGenerator;

    @Inject
    private StudentServiceImpl studentService;

    private CompletableFuture<String> loginNameGenerationTask = null;

    @Getter @Setter
    private long currentStudentId;


    @LoggedInvocation
    public String generate() {
        Map<String, String> requestParameters = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

        Long studentId = Long.parseLong(requestParameters.get("studentId"));

        Student student = studentService.getStudentById(studentId);

        this.currentStudentId = studentId;
        loginNameGenerationTask = CompletableFuture.supplyAsync(() -> studentPersonalIdGenerator.generateId(student))
                .exceptionally(Throwable::getMessage);

        return "/index.xhtml?faces-redirect=true";
    }

    public boolean isLoginNameGeneratorRunning() {
        return loginNameGenerationTask != null && !loginNameGenerationTask.isDone();
    }

    public String getLoginGenerationStatus() throws ExecutionException, InterruptedException {
        if (loginNameGenerationTask == null) {
            return null;
        }

        if (isLoginNameGeneratorRunning()) {
            return "Student's personal id generation is running...";
        }

        return "Suggested student's personal id name: " + loginNameGenerationTask.get();
    }
}