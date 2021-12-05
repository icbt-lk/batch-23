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
public interface DBUtil {
    public void connect();
    public void readStudentMarks();
    public void writeProcessResults();
    public void disconnect();
    
}
