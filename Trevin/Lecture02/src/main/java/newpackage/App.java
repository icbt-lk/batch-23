package newpackage;


import newpackage.Person;
import newpackage.Lecturer;
import newpackage.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trevi
 */
public class App {
    
    public static void main (String[] args) {
        
        Person p = new Person();
        p.getFirstName();
        p.getLastName();
        
        //Lecturer l = new Lecturer("L0001","123V","John","Smith");
       // System.out.println(l.getFullName());
        
        //Polymophism
        Person p1;
        
        p1 = new Person();
       // p1 = new Student();
       // p1 = new Lecturer();
        
        
    }
    
}
