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
public class OracleUtil implements DBUtil {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle");
    }

    @Override
    public void readStudentMarks() {
        System.out.println("Reading student marks from Oracle");
    }

    @Override
    public void writeProcessedResults() {
        System.out.println("Writing processed results to Oracle");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle");
    }
}
