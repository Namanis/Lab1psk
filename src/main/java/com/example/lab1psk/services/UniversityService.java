package com.example.lab1psk.services;

import com.example.lab1psk.entities.Student;
import com.example.lab1psk.entities.University;

import java.util.List;

public interface UniversityService {

    List<University> getAllUniversities();
    void saveUniversity (University university);
    University getUniversityById(long id);
    void updateUniversity (University university);
    void deleteUniversityById(long id);
}