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
 * @author 1895127
 */
public class TaxiJUnitTest {
    
    public TaxiJUnitTest() {
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
    public void textCreateId() {
        System.out.println("Test 1");
        Date date = new Date();
        String name = "Hummer";
        String expectedResult = "19-Mar-E-HR";
        String realResult = jhakasstaxi.Taxi.createID(date, name);
        
        assertEquals(expectedResult, realResult);
    }
}
