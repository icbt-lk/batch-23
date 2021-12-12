/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author trevi
 */
public class Process {
    
    public static void processResults(DBUtil util)
    {
        util.connect();
        util.readStudentMarks();
        util.writeProcessResults();
        util.disconnect();
    }
    
}
