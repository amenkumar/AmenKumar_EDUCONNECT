package com.edutech.progressive.service;

import com.edutech.progressive.entity.Course;

import java.sql.SQLException;
import java.util.List;

public interface CourseService {

    public List<Course> getAllCourses()throws SQLException;

    public Course getCourseById(int courseId)throws SQLException;

    public Integer addCourse(Course course)throws SQLException;

    public void updateCourse(Course course)throws SQLException;

    public void deleteCourse(int courseId)throws SQLException;

    //Do not implement these methods in CourseServiceImplJdbc.java class
    default public List<Course> getAllCourseByTeacherId(int teacherId) { return null; }
}
