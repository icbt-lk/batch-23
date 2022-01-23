/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tharik
 */
public class DBUtilTest {
    
    public DBUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPersons method, of class DBUtil.
     */
//    @Test
//    public void testGetPersons() {
//        System.out.println("getPersons");
//        DBUtil instance = new DBUtil();
//        List<Person> expResult = null;
//        List<Person> result = instance.getPersons();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getPerson method, of class DBUtil.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        int id = 2;
        DBUtil instance = new DBUtil();
        Person expResult = new Person(2, "123456788V", "Andrew", "Whey");
        Person result = instance.getPerson(id);
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getFirstName(), result.getFirstName());
        assertEquals(expResult.getLastName(), result.getLastName());
        assertEquals(expResult.getNic(), result.getNic());
    }

    @Test
    public void testPerson() {
        DBUtil instance = new DBUtil();
        Person person = new Person(99, "123456788V", "Piyal", "Perera");
        
        //Test ADD
        boolean status = instance.addPerson(person);
        assertEquals(status, true);
        
        Person result = instance.getPerson(person.getId());
        assertEquals(person.getId(), result.getId());
        assertEquals(person.getFirstName(), result.getFirstName());
        assertEquals(person.getLastName(), result.getLastName());
        assertEquals(person.getNic(), result.getNic());
        
        //Test UPDATE
        person.setFirstName("Mark");
        person.setLastName("Walsh");
        person.setNic("234567891V");
        status = instance.updatePerson(person);
        assertEquals(status, true);
        
        result = instance.getPerson(person.getId());
        assertEquals(person.getId(), result.getId());
        assertEquals(person.getFirstName(), result.getFirstName());
        assertEquals(person.getLastName(), result.getLastName());
        assertEquals(person.getNic(), result.getNic());
        
        //Test Delete
        status = instance.deletePerson(person.getId());
        assertEquals(status, true);
        
        result = instance.getPerson(person.getId());
        assertEquals(0, result.getId());
        assertEquals("", result.getFirstName());
        assertEquals("", result.getLastName());
        assertEquals("", result.getNic());
    }
    
}
