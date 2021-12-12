/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toxic.lecture1.sis.logic;

/**
 *
 * @author Tisal Thenuwara
 */
public interface DBUtil {
    
    public void connect();
    
    public void readStudentMarks();
    
    public void writeProcessedResults();
    
    public void disconnect();    
    
}
