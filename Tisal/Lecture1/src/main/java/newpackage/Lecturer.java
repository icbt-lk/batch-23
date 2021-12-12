/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Tisal Thenuwara
 */
public class Lecturer extends Person {
    private String epfNo;

    public Lecturer() {
        super();
        this.epfNo = "";
    }
    
    public Lecturer(String epfNo) {
        super();
        this.epfNo = epfNo;
    }

    public Lecturer(String epfNo, String nic, String firstName, String lastName) {
        super(nic, firstName, lastName);
        this.epfNo = epfNo;
    }

    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }
    
    @Override
    public String getFullName() {
        return super.getFullName() + "********";
    }
}
