/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

/**
 *
 * @author Tisal Thenuwara
 */
public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car rotates wheels");
    }

    @Override
    public void consume() {
        System.out.println("Car consumes petrol");
    }
    
 
}
