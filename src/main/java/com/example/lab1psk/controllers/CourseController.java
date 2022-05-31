package com.example.lab1psk.controllers;

import lombok.Getter;
import lombok.Setter;
import com.example.lab1psk.entities.Course;
import com.example.lab1psk.services.CourseServiceImpl;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named
@Getter
@Setter
public class CourseController implements Serializable {

    @Inject
    private CourseServiceImpl courseService;



    @Setter
    @Getter
    private Course course = new Course();
    private long universityId;
    private List<Long> studentIds;

    @Transactional
    public String createCourse() {
        courseService.saveCourse(course, universityId, studentIds);
        course = new Course();
        return "index?faces-redirect=true";
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}