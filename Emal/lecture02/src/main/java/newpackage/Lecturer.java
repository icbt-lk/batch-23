/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author tharik
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
