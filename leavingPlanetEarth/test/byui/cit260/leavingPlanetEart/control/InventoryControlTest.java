/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OptimusPrime
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcFuelNeeded method, of class InventoryControl.
     */
    @Test
    public void testCalcFuelNeeded() {
        System.out.println("\tTest case #1");
        double distance = 5000.0;
        double mpg = 25.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 200.0;
        double result;
        result = instance.calcFuelNeeded(distance, mpg);
        assertEquals(expResult, result, 0.0001);
     
    }
   
    {
        System.out.println("\tTest case #2");
        double distance = -100.0;
        double mpg = 7.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result;
        result = instance.calcFuelNeeded(distance, mpg);
        assertEquals(expResult, result, 0.0001);
     
    }
    
    {
        System.out.println("\tTest case #3");
        double distance = 1000.0;
        double mpg = 3.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result;
        result = instance.calcFuelNeeded(distance, mpg);
        assertEquals(expResult, result, 0.0001);
     
    }
    
    {
        System.out.println("\tTest case #4");
        double distance = 500.0;
        double mpg = 75.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result;
        result = instance.calcFuelNeeded(distance, mpg);
        assertEquals(expResult, result, 0.0001);
     
    }
    
    {
        System.out.println("\tTest case #5");
        double distance = 1.0;
        double mpg = 15.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.067;
        double result;
        result = instance.calcFuelNeeded(distance, mpg);
        assertEquals(expResult, result, 0.0001);
     
    }

    {
        System.out.println("\tTest case #6");
        double distance = 5000;
        double mpg = 5.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 1000;
        double result;
        result = instance.calcFuelNeeded(distance, mpg);
        assertEquals(expResult, result, 0.0001);
     
    }
    
    {
        System.out.println("\tTest case #7");
        double distance = 3000;
        double mpg = 50.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 60;
        double result;
        result = instance.calcFuelNeeded(distance, mpg);
        assertEquals(expResult, result, 0.0001);
     
    }
    
}
