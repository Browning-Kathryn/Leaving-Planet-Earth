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
public class calcTravelTimeTest {
    
    public calcTravelTimeTest() {
    }

    /**
     * Test of calcTravelTime method, of class calcTravelTime.
     */
    @Test
    public void testCalcTravelTime() {
        System.out.println("calcTravelTime");
        System.out.println("\Test case #1");
        
        distanceTravelled = 15;
        userInput <error>_2 = 3;
        calcTravelTime instance = new calcTravelTime();
        double expResult = 0.0;
        double result = instance.calcTravelTime(<error>, <error>_2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
