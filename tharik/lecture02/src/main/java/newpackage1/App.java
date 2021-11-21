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
public class App {
    public static void main(String[] args) {
        Vehicle v1;
        v1 = new Car();
        v1.move();
        v1 = new Helicopter();
        v1.move();
        
    }
}
