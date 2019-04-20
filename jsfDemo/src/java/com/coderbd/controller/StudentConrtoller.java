/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.controller;

import com.coderbd.dao.StudentDao;
import com.coderbd.daoImpl.StudentDaoImpl;
import com.coderbd.model.Student;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author User
 */
@ManagedBean
public class StudentConrtoller {

    public Student student;
    private List<Student> studentList;
    private StudentDao studentDao;

    public void saveStudent() {
        studentDao = new StudentDaoImpl();
        studentDao.add(student);
        System.out.println("Save Successfully");
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        student = new Student();
        this.student = student;
    }

    public List<Student> getStudentList() {
        studentDao = new StudentDaoImpl();
        studentList = studentDao.getStudents();
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

}
