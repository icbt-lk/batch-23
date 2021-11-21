/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author User
 */
public class App {
    
    public static void main(String[] args){
    
    Person p = new Person();
//    p.getFirstName();
//    p.getLastName();
            
    Lecturer l = new Lecturer("I001" , "1234", "John", "Smith");
    System.out.println(l.getFullName());
//    System.out.Println("");
    
    Person p1;
    
    p1 = new Person();
    p1 = new Student();
    }
}
