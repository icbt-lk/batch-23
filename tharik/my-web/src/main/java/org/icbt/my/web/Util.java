/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web;

import java.util.ArrayList;
import java.util.List;

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
    
}
