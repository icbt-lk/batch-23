/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle;

/**
 *
 * @author User
 */
public class Car implements Vehicle{

        public static void main(String[] args){}
    
    @Override
    public void move() {
    System.out.println("Car go brrr");    
    }

    @Override
    public void consume() {
    System.out.println("Car eat now"); 
    }
        
}
