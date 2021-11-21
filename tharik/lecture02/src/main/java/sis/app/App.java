/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis.app;

import sis.logic.DBUtil;
import sis.logic.Process;

/**
 *
 * @author tharik
 */
public class App {
    public static void main(String[] args) {
        
        DBUtil util = new OracleUtil();
        Process.processResults(util);
        
    }
}
