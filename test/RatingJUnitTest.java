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
public class RatingJUnitTest {
    
    public RatingJUnitTest() {
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
    public void testCreateID(){
        System.out.println("Create ID 1");
        
        Date dt=new Date();
        String name = "Samriti";
        String expectedResult = "19-Mar-E-SI";
        String realResult = jhakasstaxi.Rating.createID(dt, name);
        
        assertEquals(expectedResult, realResult);
    }

    @Test
    public void testCreateID2(){
        System.out.println("Create ID 2");
        
        Date dt=new Date();
        String name = "Akansh";
        String expectedResult = "19-Mar-E-SI";
        String realResult = jhakasstaxi.Rating.createID(dt, name);
        
        assertEquals(expectedResult, realResult);
    }

    @Test
    public void testCreateID3(){
        System.out.println("Create ID 3");
        
        Date dt=new Date(2020, 2, 2);
        String name = "Samriti";
        String expectedResult = "19-Mar-E-SI";
        String realResult = jhakasstaxi.Rating.createID(dt, name);
        
        assertEquals(expectedResult, realResult);
    }
}
