/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toxic.lecture1.sis.logic;

/**
 *
 * @author Tisal Thenuwara
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
