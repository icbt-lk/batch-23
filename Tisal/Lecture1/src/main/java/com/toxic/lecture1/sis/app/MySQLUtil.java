/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toxic.lecture1.sis.app;

import com.toxic.lecture1.sis.logic.DBUtil;

/**
 *
 * @author Tisal Thenuwara
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
