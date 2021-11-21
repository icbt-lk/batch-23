/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture03;

/**
 *
 * @author tharik
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
