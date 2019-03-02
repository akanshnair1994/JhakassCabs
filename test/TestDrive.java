/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import jhakasstaxi.Drive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1895271
 */
public class TestDrive {
    
    public TestDrive() {
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
    public void testCreateID() {
        System.out.println("Test Number 1 for createID() method in class Drive");
        
        Date date = new Date();
        String name = "Akansh";
        String expectedResult = "19-Mar-E-AH";
        String realResult = Drive.createID(date, name);
        
        assertEquals(expectedResult, realResult);
    }
}
