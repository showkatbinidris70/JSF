<%-- 
    Document   : newjsp
    Created on : May 6, 2019, 3:24:26 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AdminServlet">
            Name:<input type="text" name="name"/><br/>
            Password:<input type="password" name="password"/><br/>
            <input type="submit" value="login">
        </form>
    </body>
</html>
