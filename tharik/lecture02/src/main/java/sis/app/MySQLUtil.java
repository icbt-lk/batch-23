/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis.app;

import sis.logic.DBUtil;

/**
 *
 * @author tharik
 */
public class MySQLUtil implements DBUtil {

    @Override
    public void connect() {
        System.out.println("Connecting to My SQL");
    }

    @Override
    public void readStudentMarks() {
        System.out.println("Reading student marks from My SQL");
    }

    @Override
    public void writeProcessedResults() {
        System.out.println("Writing processed results to My SQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from My SQL");
    }
    
}
