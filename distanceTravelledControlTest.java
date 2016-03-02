/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.leavingPlanetEarth.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class distanceTravelledControlTest {
    
    public distanceTravelledControlTest() {
    }

    /**
     * Test of calcDistanceTravel method, of class distanceTravelledControl.
     */
    @Test
    public void testCalcDistanceTravel() {
        System.out.println("calcDistanceTravel");
        /*********************
         * Test case #1
         */
        System.out.println("\tTest case #1");
        double distance = 15.0;
        double pace = 5.0;
        
        distanceTravelledControl instance = new distanceTravelledControl();
        double expResult = 3.0;
        double result = instance.calcDistanceTravel(distance, pace);
        assertEquals(expResult, result, 0.0);
      
    }
    {
         System.out.println("calcDistanceTravel");
        /*********************
         * Test case #2
         */
        System.out.println("\tTest case #2");
        double distance = 15.0;
        double pace = 300.0;
        
        distanceTravelledControl instance = new distanceTravelledControl();
        double expResult = -1;
        double result = instance.calcDistanceTravel(distance, pace);
        assertEquals(expResult, result, 0.0);
    }
    {
         System.out.println("calcDistanceTravel");
        /*********************
         * Test case #3
         */
        System.out.println("\tTest case #3");
        double distance = 100.0;
        double pace = 50.0;
        
        distanceTravelledControl instance = new distanceTravelledControl();
        double expResult = -1;
        double result = instance.calcDistanceTravel(distance, pace);
        assertEquals(expResult, result, 0.0);
    }
    {
         System.out.println("calcDistanceTravel");
        /*********************
         * Test case #4
         */
        System.out.println("\tTest case #4");
        double distance = 7.0;
        double pace = 14.0;
        
        distanceTravelledControl instance = new distanceTravelledControl();
        double expResult = -1;
        double result = instance.calcDistanceTravel(distance, pace);
        assertEquals(expResult, result, 0.0);
    }
    {
         System.out.println("calcDistanceTravel");
        /*********************
         * Test case #5
         */
        System.out.println("\tTest case #5");
        double distance = 0.0;
        double pace = 15.0;
        
        distanceTravelledControl instance = new distanceTravelledControl();
        double expResult = -1;
        double result = instance.calcDistanceTravel(distance, pace);
        assertEquals(expResult, result, 0.0);
    }
    {
         System.out.println("calcDistanceTravel");
        /*********************
         * Test case #6
         */
        System.out.println("\tTest case #6");
        double distance = 15.0;
        double pace = 5.0;
        
        distanceTravelledControl instance = new distanceTravelledControl();
        double expResult = 3.0;
        double result = instance.calcDistanceTravel(distance, pace);
        assertEquals(expResult, result, 0.0);
    }
    {
         System.out.println("calcDistanceTravel");
        /*********************
         * Test case #7
         */
        System.out.println("\tTest case #7");
        double distance = 100.0;
        double pace = 10.0;
        
        distanceTravelledControl instance = new distanceTravelledControl();
        double expResult = 10.0;
        double result = instance.calcDistanceTravel(distance, pace);
        assertEquals(expResult, result, 0.0);
    }
    
}
