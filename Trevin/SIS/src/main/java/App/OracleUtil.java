/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Logic.DBUtil;
import Logic.Process;

/**
 *
 * @author trevi
 */
public class OracleUtil implements DBUtil {
    
    @Override
    public void connect() {
       System.out.println("Connected to the Oracle Database");
    }
    
    @Override
    public void readStudentMarks(){
        System.out.println("Read Student data from Oracle");
    }
    
    @Override
    public void writeProcessResults(){
        System.out.println("Process Results from Oracle");
    }
    
    @Override
    public void disconnect(){
        System.out.println("Disconnected from the Oracle Database");
    }
    
}
