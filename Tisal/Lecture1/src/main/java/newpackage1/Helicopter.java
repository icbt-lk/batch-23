/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

/**
 *
 * @author Tisal Thenuwara
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
