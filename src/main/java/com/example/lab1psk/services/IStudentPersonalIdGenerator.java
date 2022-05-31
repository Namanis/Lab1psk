package com.example.lab1psk.services;



import com.example.lab1psk.entities.Student;

public interface IStudentPersonalIdGenerator {
    String generateId(Student student);
}