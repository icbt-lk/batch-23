/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author tharik
 */
public class App {
    public static void main(String[] args) {            
        Lecturer l = new Lecturer("I001", "123V", "John", "Smith");
        System.out.println(l.getFullName());
        
        Person p1;
        
        p1 = new Student();
        p1 = new Lecturer();
    }
}
