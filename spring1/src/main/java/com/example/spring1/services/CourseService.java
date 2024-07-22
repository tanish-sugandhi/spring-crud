package com.example.spring1.services;

import java.util.*;

import com.example.spring1.entities.Course;

public interface CourseService {
   public List<Course> getCourses();
   
   public Course getCourse(long courseId);
   
   public String addCourse(Course course);
   
   public Course updateCourse(Course course);
   
   public Course deleteCourse(long courseId);
}
