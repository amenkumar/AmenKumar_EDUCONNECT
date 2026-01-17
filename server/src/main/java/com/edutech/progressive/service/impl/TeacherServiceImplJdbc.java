package com.edutech.progressive.service.impl;

import java.util.List;

import com.edutech.progressive.dao.TeacherDAO;
import com.edutech.progressive.entity.Teacher;
import com.edutech.progressive.service.TeacherService;

public class TeacherServiceImplJdbc implements TeacherService  {
    private TeacherDAO teacherDAO;

    @Override
    public List<Teacher> getAllTeachers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTeachers'");
    }

    @Override
    public Integer addTeacher(Teacher teacher) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTeacher'");
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTeacherSortedByExperience'");
    }

    public void updateTeacher(Teacher teacher){

    }
    public void deleteTeacher(int teacherId){

    }
    public Teacher getAllTeachersById(int teacherId){
        return null;
    }

}