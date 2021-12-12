/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lecture02;

/**
 *
 * @author trevi
 */
public class App {
    //This is the main Method in Java
    public static void main(String[] args)
    {
        Student.a = "a";
        Student st = new Student();
        st.a = "a2";
        st.b = "b";
        
        System.out.println(st.a);
        System.out.println(st.a);
    }
    
}
