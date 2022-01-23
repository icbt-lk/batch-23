/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web;

import icbt.ICBTService;
import icbt.ICBTService_Service;
import icbt.Person;
import icbt.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tharik
 */
public class Util {    
    public static List<Person> getPersons() {        
        return Proxy.getInstance().getPersons();
    }
    
    public static User authenticate(HttpServletRequest request, HttpServletResponse response, HttpSession session) 
            throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User authenticatedUser = Util.authenticate(username, password);
        boolean authenticated = authenticatedUser != null;

        if (!authenticated) {
             // If username and password are incorrect/invalid
            if (request.getCookies() != null) {
                for (Cookie cookie : request.getCookies()) {
                    if (cookie.getName().equals("session-id")) {
                        authenticatedUser = (User) session.getAttribute(cookie.getValue());
                        authenticated = authenticatedUser != null;
                        break;
                    }
                }  
            }
            if (!authenticated) {
                response.sendRedirect("login.jsp"); 
            }
        } else {
            // If username and password are correct
            String sessionId = UUID.randomUUID().toString().toUpperCase().replace("-", ""); 
            session.setAttribute(sessionId, authenticatedUser);
            response.addCookie(new Cookie("session-id", sessionId));
        }
        return authenticatedUser;
    }
    
    public static User authenticate(String username, String password) {  
        User user = null;
        
        if (username != null && password != null) {
            user = Proxy.getInstance().authenticate(username, password);
            
            if (user.getUsername() == null) {
                user = null;
            }
        }
        return user;
    }
}
