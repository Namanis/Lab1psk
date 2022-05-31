package com.example.lab1psk.decorators;



import com.example.lab1psk.entities.Student;
import com.example.lab1psk.services.IStudentPersonalIdGenerator;
import com.example.lab1psk.services.StudentPersonalIdGenerator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class StudentPersonalIdGeneratorDecorator implements IStudentPersonalIdGenerator {
    @Delegate
    @Any
    @Inject
    public StudentPersonalIdGenerator studentPersonalIdGenerator;

    @Override
    public String generateId(Student student) {
        if (student.getPersonalId() != null) {
            throw new IllegalArgumentException("Student already has an ID");
        }

        return studentPersonalIdGenerator.generateId(student);
    }
}