/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web;

import icbt.ICBTService;
import icbt.ICBTService_Service;

/**
 *
 * @author tharik
 */
public class Proxy {
    
    private static ICBTService instance = null;
    
    private Proxy() {
    
    }
    
    public static ICBTService getInstance() {
        if (instance == null) {
            ICBTService_Service service = new ICBTService_Service();
            instance = service.getICBTServicePort();  
        }
        return instance;
    }
}
