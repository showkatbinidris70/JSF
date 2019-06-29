<%-- 
    Document   : loginAuthenticate
    Created on : May 6, 2019, 6:52:50 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:if test="${empty param.username or empty param.password}">
            <c:redirect url=""
        </c:if>
    </body>
</html>
