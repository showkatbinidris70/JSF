/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.model;

import java.util.Date;

/**
 *
 * @author User
 */
public class Student {
    private int id;
    private String studentName;
    private String gender;
    private String round;
    private Date currentStartDate;
    private boolean courseStatus;
    private String[] completedCourse;

    public Student() {
    }

    public Student(int id, String studentName, String gender, String round, Date currentStartDate, boolean courseStatus, String[] completedCourse) {
        this.id = id;
        this.studentName = studentName;
        this.gender = gender;
        this.round = round;
        this.currentStartDate = currentStartDate;
        this.courseStatus = courseStatus;
        this.completedCourse = completedCourse;
    }

    public Student(String studentName, String gender, String round, Date currentStartDate, boolean courseStatus, String[] completedCourse) {
        this.studentName = studentName;
        this.gender = gender;
        this.round = round;
        this.currentStartDate = currentStartDate;
        this.courseStatus = courseStatus;
        this.completedCourse = completedCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Date getCurrentStartDate() {
        return currentStartDate;
    }

    public void setCurrentStartDate(Date currentStartDate) {
        this.currentStartDate = currentStartDate;
    }

    public boolean isCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(boolean courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String[] getCompletedCourse() {
        return completedCourse;
    }

    public void setCompletedCourse(String[] completedCourse) {
        this.completedCourse = completedCourse;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", studentName=" + studentName + ", gender=" + gender + ", round=" + round + ", currentStartDate=" + currentStartDate + ", courseStatus=" + courseStatus + ", completedCourse=" + completedCourse + '}';
    }
    
}
