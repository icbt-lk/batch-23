/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Tisal Thenuwara
 */
public class Student extends Person {
    private String stNo;
    
    private String gpa;

    public Student() {
    }
    
    public Student(String stNo, String gpa) {
        this.stNo = stNo;
        this.gpa = gpa;
    }

    public Student(String stNo, String gpa, String nic, String firstName, String lastName) {
        super(nic, firstName, lastName);
        this.stNo = stNo;
        this.gpa = gpa;
    }

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
