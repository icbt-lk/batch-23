/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture03;

/**
 *
 * @author Tisal Thenuwara
 */
public class App {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId("ST0001");
        st.setFirstName("John");
        st.setLastName("Smith");
       
        Student st2 = new Student("ST0002", "George", "Whey");
       
        System.out.println(st2.getId());   
    }
}
