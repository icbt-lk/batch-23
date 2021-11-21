/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.lecture02;

/**
 *
 * @author tharik
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
