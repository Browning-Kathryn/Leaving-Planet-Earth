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
    
     @Test
    public void testCalcRations() {
        System.out.println("\tTest case #R1");
        double noPeople = 6.0;
        double inventoryItem = 2.0;
        InventoryControl instance = new InventoryControl();
        double expResult = .333;
        double result;
        result = instance.calcRations(noPeople, inventoryItem);
        assertEquals(expResult, result, 0.0001);
     
    }
    {
        System.out.println("\tTest case #R2");
        double noPeople = -1;
        double inventoryItem = 4.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result;
        result = instance.calcRations(noPeople, inventoryItem);
        assertEquals(expResult, result, 0.0001);
     
    }
     {
        System.out.println("\tTest case #R3");
        double noPeople = 2;
        double inventoryItem = 0.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result;
        result = instance.calcRations(noPeople, inventoryItem);
        assertEquals(expResult, result, 0.0001);
     
    }
     
    {
        System.out.println("\tTest case #R4");
        double noPeople = 3;
        double inventoryItem = 200.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result;
        result = instance.calcRations(noPeople, inventoryItem);
        assertEquals(expResult, result, 0.0001);
     
    } 
    
    
    {
        System.out.println("\tTest case #R5");
        double noPeople = 12;
        double inventoryItem = 50.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 4.167;
        double result;
        result = instance.calcRations(noPeople, inventoryItem);
        assertEquals(expResult, result, 0.0001);
     
    } 
    
     {
        System.out.println("\tTest case #R6");
        double noPeople = 65;
        double inventoryItem = 5.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.077;
        double result;
        result = instance.calcRations(noPeople, inventoryItem);
        assertEquals(expResult, result, 0.1);
     
    }
     {
        System.out.println("\tTest case #R7");
        double noPeople = 20;
        double inventoryItem = 100.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 5.0;
        double result;
        result = instance.calcRations(noPeople, inventoryItem);
        assertEquals(expResult, result, 0.1);
     
    }
     
}
