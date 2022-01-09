<%-- 
    Document   : index
    Created on : Jan 9, 2022, 10:35:26 AM
    Author     : tharik
--%>

<%@page import="icbt.Person"%>
<%@page import="icbt.ICBTService"%>
<%@page import="icbt.ICBTService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                ICBTService_Service service = new ICBTService_Service();
                ICBTService proxy = service.getICBTServicePort();
                
                Person p = proxy.getPerson();
                out.print(p.getFirstName());
            %>
        </h1>
        <h2>
            <%
                out.print(p.getLastName());
            %>
        </h2>
        <h3>
            <%
                out.print(p.getNic());
            %>
        </h3>
    </body>
</html>
