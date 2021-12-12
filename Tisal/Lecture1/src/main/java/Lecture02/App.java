/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture02;

/**
 *
 * @author Tisal Thenuwara
 */
public class App {
    public static final String PREFIX_NAME = "st";
    
    public static void main(String[] args) {
        Student.a = "a";
        Student st = new Student();
        st.a = "a2";
        st.b = "bob";
        
        Student st2 = new Student();
        st2.a = "a3";
        st2.b = "james";
        
        System.out.println(Student.a); // a2
        System.out.println(st.a); // a2
        
        System.out.println(st.b); // bob
        System.out.println(st2.b); // james
    }
}