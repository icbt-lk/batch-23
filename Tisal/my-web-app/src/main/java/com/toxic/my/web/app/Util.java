/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toxic.my.web.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tisal Thenuwara
 */
public class Util {
    public static List<Person> getPersons() {        
        List<Person> persons = new ArrayList<>();
        
        persons.add(new Person("123V", "John", "Smith"));
        persons.add(new Person("124V", "George", "Whey"));
        persons.add(new Person("666V", "James", "Bond"));
        
        return persons;
    }
    public static boolean authenticate (String username, String password){
        boolean hasAuthenticated = false;
        
        if(username != null && password !=null){
//            if(username.equals("icbt") && password.equals("icbt123")){
//                hasAuthenticated = true;
//            }
            hasAuthenticated = username.equals("icbt") && password.equals("icbt123");
        }
        return hasAuthenticated;
    }
}
