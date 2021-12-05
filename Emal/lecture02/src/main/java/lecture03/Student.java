/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture03;

/**
 *
 * @author tharik
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
