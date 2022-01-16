/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web;

import icbt.Person;

/**
 *
 * @author tharik
 */
public class User extends Person {
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password, int id, String nic, String firstName, String lastName) {
        super.setId(id);
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setNic(nic);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
