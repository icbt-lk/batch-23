<%-- 
    Document   : login
    Created on : Dec 5, 2021, 8:33:42 AM
    Author     : tharik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp" method="post">
          <label for="username">Username : </label><br>
          <input type="text" id="fname" name="username" value=""><br>
          <label for="password">Password : </label><br>
          <input type="password" id="lname" name="password" value=""><br><br>
          <input type="submit" value="Login">
        </form> 
    </body>
</html>
