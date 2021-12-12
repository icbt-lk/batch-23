/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author trevi
 */
public class Student extends Person{
    
    private String stNo;
    private String gpa;

    //Constructor
    public Student(String stNo, String gpa) {
        this.stNo = stNo;
        this.gpa = gpa;
    }
    
    //Getters & Setters
    public String getStNo() {
        return stNo;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
    
    
    
}
