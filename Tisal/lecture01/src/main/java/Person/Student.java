/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author User
 */
public class Student extends Person{
    private String stNo;
    private String gpa;

    public Student(String stNo, String gpa, String Nic, String FirstName, String LastName) {
        super(Nic, FirstName, LastName);
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

    public Student() {
    }
    
}
