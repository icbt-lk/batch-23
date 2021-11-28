<%-- 
    Document   : index
    Created on : Nov 28, 2021, 9:28:00 AM
    Author     : tharik
--%>

<%@page import="org.icbt.my.web.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="main.css">
    </head>
    <body>
        <%
            String greeting = "Hello";
            Person p = new Person();
            p.setFirstName("John");
            p.setLastName("Smith"); 
        %>
        
        <div class="panel">
            <h1><% out.print(greeting + " " + p.getFullName() + "!!!"); %></h1>
        </div>
        
        
        
        
    </body>
</html>
