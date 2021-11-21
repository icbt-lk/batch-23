/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis.logic;

/**
 *
 * @author tharik
 */
public class Process {
    public static void processResults(DBUtil util) {
        //Logics
        util.connect();
        
        //Logics
        util.readStudentMarks();
        util.writeProcessedResults();
        //Logics
        util.writeProcessedResults();
        //Logics
        util.disconnect();
    }
}
