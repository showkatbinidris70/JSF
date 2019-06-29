<%-- 
    Document   : login
    Created on : May 11, 2019, 1:40:27 PM
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
        <form id="loginForm" method="post" action="j_security_cehck">
            <p>
                Username:<input type="text" name="j_username" id="j_username"/>
                <br/>
                Password:<input type="password" name="j_password" id="u_paasword"/>
                <br/>
                <button type="submit">login</button>
            </p> 
        </form>
    </body>
</html>
