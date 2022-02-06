/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web.service.rest;

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
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = ConnectonUtil.getInstance();
            
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
    
    public List<Person> searchPerson(String id) {
        List<Person> persons = new ArrayList<>();   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = ConnectonUtil.getInstance();
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM person where first_name LIKE '%" + id + "%'");
            
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
            Connection conn = ConnectonUtil.getInstance();
            
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
    
    public boolean addPerson(Person p) {     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = ConnectonUtil.getInstance();
            
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO person (id, first_name, last_name, nic) "
                    + "VALUES "
                    + "(" + p.getId() + ", '" + p.getFirstName() 
                    + "', '" + p.getLastName() + "', '" + p.getNic() + "')");
            return true;
        } catch(SQLException e) {
            System.out.println(e);
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }  
        return false;
    }
    
    public boolean updatePerson(Person p) {     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = ConnectonUtil.getInstance();
            
            Statement st = conn.createStatement();
            st.executeUpdate("UPDATE person SET first_name = '" + p.getFirstName() + "', "
                                + "last_name = '" + p.getLastName() + "', "
                                + "nic = '"+ p.getNic() +"' "
                                + "WHERE (id = " + p.getId() + ")");
            return true;
        } catch(SQLException e) {
            System.out.println(e);
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }  
        return false;
    }
    
    public boolean deletePerson(int id) {     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = ConnectonUtil.getInstance();
            
            Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM person WHERE (id = "+ id + ")");
            return true;
        } catch(SQLException e) {
            System.out.println(e);
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }  
        return false;
    }
}
