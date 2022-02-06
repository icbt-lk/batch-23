/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web.service.rest;

/**
 *
 * @author tharik
 */
public class ResponseMessage {
    private String message;

    public ResponseMessage(String message, int status) {
        this.message = message;
    }
    
    public ResponseMessage() {
        this.message = "";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }  
}
