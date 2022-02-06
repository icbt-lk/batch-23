/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web.service.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tharik
 */
public class ConnectonUtil {
    private static Connection conn = null;
    
    private static String url = "jdbc:mysql://localhost:3306/batch23";
    private static String user = "";
    private static String pass = "";
    
    private ConnectonUtil() {
     
    }
    
    public static Connection getInstance() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, pass);
            } catch(ClassNotFoundException e) {
                System.out.println(e);
            } catch(SQLException e) {
                System.out.println(e);
            }
        }
        return conn;
    }
}
