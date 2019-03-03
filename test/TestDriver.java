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
 * @author 1894832
 */
public class TestDriver {
    
    public TestDriver() {
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
    public void driverTest()
    {
        System.out.println("Test number 1 for createId method");

        Date date = new Date();
        String name = "jameel";
        String expectedResult = "19-Mar-E-JL";
        String realResult = jhakasstaxi.Driver.createID(date, name);
        assertEquals(expectedResult, realResult);
        //assertEquals(expectedResult, realResult, 0.01);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
