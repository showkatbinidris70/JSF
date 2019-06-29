<%-- 
    Document   : loginAuthenticate
    Created on : May 8, 2019, 3:30:06 PM
    Author     : User
--%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
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
            <c:redirect url="login.jsp">
                <c:param name="errMsg" value="Please enter username or password"/>
            </c:redirect>
        </c:if>
        <c:if test="${not empty param.username or not empty param.password}">
            <s:setDataSource var="ds" driver="com.mysql.jdbc.Drive"
                             url="jdbc:mysql://localhost:3306/jstllogin"
                             user="root" password="1234"/>
            <s:query dataSource="ds" var="selectQ">
                select count(*) as kount from users
                where username = '${loginUser}'
                and password='${param.password}'
            </s:query>
            <c:forEach items="${selectQ.rows}" var="r">
                <c:choose>
                    <c:when test="${r.kount gt 0}">
                        <c:redirect url="index.jsp"/>
                    </c:when>
                </c:choose>
                <c:otherwise>
                    <c:redirect url="login.jsp">
                         <c:param name="errMsg" value="Please enter username or password"/>
                    </c:redirect>
                </c:otherwise>
            </c:forEach>
        </c:if>
    </body>
</html>
