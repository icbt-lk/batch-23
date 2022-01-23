<%-- 
    Document   : index
    Created on : Dec 5, 2021, 8:17:58 AM
    Author     : Tisal Thenuwara 
--%>


<%@page import="com.toxic.my.web.app.Util"%>
<%@page import="com.toxic.my.web.app.Person"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="main.css">
        
        <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ=" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.js"></script>
    </head>
    <body>
        <%   
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if (password != null){
            if (Util.authenticate(username, password)) {
                out.print("<h1> Welcome "+username+"</h1>"); 
            }
            else {
            response.sendRedirect("login.jsp");
            }
            }        
//             {
//                out.print("<h1>" + password + "</h1>");
//            }
            
            for(Person p : Util.getPersons()) {
                out.print("<p1>" + p.getFullName() + "</p1><br/>");
            }  
        %>
        <br/>
        <table border="1">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>NIC</th>
            </tr>
            <%for(Person p : Util.getPersons()) {%>
            <tr>
                <td><%out.print(p.getFirstName());%></td>
                <td><%out.print(p.getLastName());%></td>
                <td><%out.print(p.getNic());%></td>
            </tr>
            <%}%>
        </table>
        
    
        <br/>
        <table id="person_tbl" class="display">
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>NIC</th>
                </tr>
            </thead>
            <tbody>
                <%for(Person p : Util.getPersons()) {%>
                    <tr>
                        <td><%out.print(p.getFirstName());%></td>
                        <td><%out.print(p.getLastName());%></td>
                        <td><%out.print(p.getNic());%></td>
                    </tr>
                <%}%>
            </tbody>
        </table>
        <script>
            $(document).ready( function () {
                $('#person_tbl').DataTable();
            } );
        </script>
        
    </body>
</html>
