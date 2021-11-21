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
public class App {
    
    public static void main(String[] args)
    {
       DBUtil util = new OracleUtil();
       Process.processResults(util);
    }
    
}
