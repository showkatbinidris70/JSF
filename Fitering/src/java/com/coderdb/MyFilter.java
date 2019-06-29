/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderdb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author User
 */
public class MyFilter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
       throws IOException, SecurityException, ServletException{
        PrintWriter out = response.getWriter();
        
        String password = request.getParameter("password");
        if(password.equals("123")){
        chain.doFilter(request, response);
        }else{
        out.print("username or password error!");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
        }
    }
}
