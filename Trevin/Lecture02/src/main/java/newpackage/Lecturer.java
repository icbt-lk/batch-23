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
public class Lecturer extends Person {
    
    private String epfNo;

    // Constructor
    public Lecturer(String epfNo) {
        this.epfNo = epfNo;
    }

    
    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }

   
    
    
}
