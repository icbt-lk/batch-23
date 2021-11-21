/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author User
 */
public class Person {
    
    String Nic;
    String FirstName;
    String LastName;

    public Person(String Nic, String FirstName, String LastName) {
        this.Nic = Nic;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public Person() {
        this.Nic = "";
        this.FirstName = "";
        this.LastName = "";
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String Nic) {
        this.Nic = Nic;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    public String getFullName(){
        return this.FirstName +" "+ this.LastName;
    }
}
