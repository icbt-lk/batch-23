/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tharik
 */
public class DBUtil {
    
    private String url = "jdbc:mysql://localhost:3306/batch23";
    private String user = "";
    private String pass = "";
    
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM person");
            
            while(rs.next()) {
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setFirstName(rs.getString("first_name"));
                p.setLastName(rs.getString("last_name"));
                p.setNic(rs.getString("nic"));
                
                persons.add(p);
            } 
        } catch(SQLException e) {
            System.out.println(e);
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }  
        return persons;
    }
    
    public Person getPerson(int id) {
        Person p = new Person();     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM person where id=" + id);
            
            while(rs.next()) {
                p.setId(rs.getInt("id"));
                p.setFirstName(rs.getString("first_name"));
                p.setLastName(rs.getString("last_name"));
                p.setNic(rs.getString("nic"));
            } 
        } catch(SQLException e) {
            System.out.println(e);
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }  
        return p;
    }
    
    public User getUser(String username) {
        User u = new User();     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users JOIN person on person_id = id WHERE username='" + username +"'");
            
            while(rs.next()) {
                u.setId(rs.getInt("id"));
                u.setFirstName(rs.getString("first_name"));
                u.setLastName(rs.getString("last_name"));
                u.setNic(rs.getString("nic"));
                u.setPassword(rs.getString("password"));
                u.setUsername(rs.getString("username"));
            } 
        } catch(SQLException e) {
            System.out.println(e);
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }  
        return u;
    }
}
