/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toxic.lecture1.sis.app;

import com.toxic.lecture1.sis.logic.DBUtil;
import com.toxic.lecture1.sis.logic.Process;

/**
 *
 * @author Tisal Thenuwara
 */
public class App {
    public static void main(String[] args) {
        
        DBUtil util = new OracleUtil();
        Process.processResults(util);
        
    }
}
