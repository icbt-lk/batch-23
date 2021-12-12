/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
        List<Person> persons = new ArrayList<>();
        
        persons.add(new Person("123V", "John", "Smith"));
        persons.add(new Person("124V", "George", "Whey"));
        persons.add(new Person("666V", "James", "Bond"));
        
        return persons;
    }
    
    public static String authenticate(HttpServletRequest request, HttpServletResponse response, HttpSession session) 
            throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean authenticated = Util.authenticate(username, password);

        if (!authenticated) {
             // If username and password are incorrect/invalid      
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("session-id")) {
                    username = session.getAttribute(cookie.getValue()).toString();
                    authenticated = username != null;
                    break;
                }
            } 
            if (!authenticated) {
                response.sendRedirect("login.jsp"); 
            }
        }

        // If username and password are correct
        String sessionId = "123"; 
        session.setAttribute(sessionId, username);
        response.addCookie(new Cookie("session-id", sessionId));
        return username;
    }
    
    public static boolean authenticate(String username, String password) {
        boolean hasAuthenticated = false;
        
        if (username != null && password != null) {
            // Ideally should load from DB
            hasAuthenticated = username.equals("icbt") && password.equals("icbt123");
        }
        
        return hasAuthenticated;
    }
}
