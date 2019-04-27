package com.coderbd.comtroller;

import com.coderbd.entity.Student;
import com.coderbd.service.StudentService;
import com.coderbd.serviceImpl.StudentServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentController {

    private Student student;
    private List<Student> students;
    private StudentService service;

    
    public void save(){
    service = new StudentServiceImpl();
    service.svaeStudent(student);
        System.out.println("Successfully save!!!");
    
    }
    
    
    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentService getService() {
        students = new ArrayList<>();
        service = new StudentServiceImpl();
        students = service.getAllStudents();
        return service;
    }

    public void setService(StudentService service) {
        this.service = service;
    }

}
