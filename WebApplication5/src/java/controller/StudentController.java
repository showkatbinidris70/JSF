/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Student;
import java.util.List;
import javax.annotation.ManagedBean;
import service.StudentService;

/**
 *
 * @author User
 */
@ManagedBean
public class StudentController {
     private Student student;
    private List<Student> students;
    private StudentService service;
    
}
