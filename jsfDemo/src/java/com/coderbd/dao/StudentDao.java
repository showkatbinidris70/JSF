/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.model.Student;
import java.util.List;

/**
 *
 * @author User
 */
public interface StudentDao {

    void add(Student student);

    List<Student> getStudents();
}
