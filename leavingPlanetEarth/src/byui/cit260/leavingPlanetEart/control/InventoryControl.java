/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;

/**
 *
 * @author OptimusPrime
 */
public class InventoryControl {
    public double calcFuelNeeded(double distance, double mpg){
        if (distance <= 0){
        return -1;
    }
        if (mpg < 5 || mpg > 50){
            return -1;
           }
         double gallons = Math.round((distance/mpg)*1000.0)/1000.0;
         
                 
         return gallons;
        
    }

}