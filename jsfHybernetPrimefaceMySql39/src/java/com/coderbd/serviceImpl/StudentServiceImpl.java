/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.serviceImpl;

import com.coderbd.entity.Student;
import com.coderbd.service.StudentService;
import com.coderbd.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public void svaeStudent(Student student) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.save(student);
        tr.commit();
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        list = session.createCriteria(Student.class).list();
        tr.commit();
        return list;
    }

}
