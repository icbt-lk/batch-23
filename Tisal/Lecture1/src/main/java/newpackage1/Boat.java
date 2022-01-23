/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

/**
 *
 * @author Tisal Thenuwara
 */
public class Boat implements Vehicle {

    @Override
    public void move() {
       System.out.println("Rotating properller");
    }

    @Override
    public void consume() {
        System.out.println("Consuming petrol");
    }
    
}
