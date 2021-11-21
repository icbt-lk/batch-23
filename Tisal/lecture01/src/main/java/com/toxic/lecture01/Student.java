/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toxic.lecture01;

/**
 *
 * @author User
 */
public class Student {
    
    String FirstName;
    String LastName;
    String Id;

    public Student() {
        this.FirstName = "";
        this.LastName = "";
        this.Id = "";
    }
    
    public Student(String FirstName, String LastName, String Id) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getId() {
        return Id;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    
    
}
