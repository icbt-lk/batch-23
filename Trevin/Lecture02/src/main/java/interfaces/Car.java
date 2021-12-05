/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author trevi
 */
public class Car implements Vehicles {
    
        @Override
    public void move() {
        System.out.println("Car Rotates blades");

    }
    
    @Override
    public void consume(){
        System.out.println("Car Consumes Petrol");
    }
    
}
