/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.projsp.filters;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author User
 */
public final class AuditFilter implements Filter {
private FilterConfig filterConfig = null;
    public AuditFilter() {
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        long startTime = System.currentTimeMillis();
        String remoteAddress = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        HttpServletRequest myReq = (HttpServletRequest) request;
        String reqURI = myReq.getRequestURI();
        chain.doFilter(request, response);
        
      filterConfig.getServletContext().log( "User at IP" + remoteAddress + "(" + remoteHost+") accessed resource" + reqURI + "and used"
                    +(System.currentTimeMillis() - startTime) + "ns");
      
    }

    public void destroy() {
    }

    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;

    }

}
