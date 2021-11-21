/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author User
 */
public class Lecturer extends Person {
    private String epfNo;
    
    public Lecturer(){
        super();
        this.epfNo = "";
    }

    public Lecturer(String epfNo, String Nic, String FirstName, String LastName) {
        super(Nic, FirstName, LastName);
        this.epfNo = epfNo;
    }
    
}

