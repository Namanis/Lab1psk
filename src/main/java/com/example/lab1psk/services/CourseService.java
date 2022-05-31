package com.example.lab1psk.services;

import com.example.lab1psk.entities.Course;
import com.example.lab1psk.entities.University;

import java.util.List;


public interface CourseService {

    Course createCourse(Course course, long universityId, List<Long> studentIds);
    List<Course> getAllCourses();
    void saveCourse(Course course, long universityId, List<Long> studentIds);
    Course getCourseById(long id);
    void updateCourse (Course course);
    void deleteCourseById(long id);
}
