/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1896513
 */
public class PersonJUnitTest {
    
    public PersonJUnitTest() {
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
    
    @Test
    public void testCreateID3(){
        System.out.println("Create ID 3");
        
        Date dt=new Date();
        String name = "Kushal";
        String expectedResult = "19-Mar-E-KL";
        String realResult = jhakasstaxi.Rating.createID(dt, name);
        
        assertEquals(expectedResult, realResult);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
