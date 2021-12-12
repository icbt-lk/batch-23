/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Tisal Thenuwara
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
