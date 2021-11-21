/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author tharik
 */
public class Helicopter implements Vehicle {

    @Override
    public void move() {
        System.out.println("Helicopter rotates blades");
    }

    @Override
    public void consume() {
        System.out.println("Helicopter consumes avgas");
    }
    
 
}
