/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture03;

/**
 *
 * @author Tisal Thenuwara
 */
public class Student {
    private String id;
    
    private String firstName;
    
    private String lastName;

    public String getId() {
        return id;
    }
    
    public Student() {
        this.id = "";
        this.firstName = "";
        this.lastName = "";
    }

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 
}
