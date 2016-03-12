/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;
import byui.cit260.leavingPlanetEarth.model.InventoryItem;
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

    public double calcRations(double noPeople, double inventoryItem){
        if(noPeople <= 0){
            return-1;
        }
        if(inventoryItem < 1 || inventoryItem >100){
            return-1;
        }
        
        double rations = Math.round((inventoryItem/noPeople)*1000.0)/1000.0;
        
        return rations;
                
    }
    
    public static void sortByDescription(InventoryItem[]items){
        InventoryItem tempItem;
        for(int i=0;i< items.length-1; i++){
            for(int j =0; j< items.length-1-i; j++){
                if(items[j].getDescription().compareToIgnoreCase(items[j + 1].getDescription())>0){
                    tempItem = items[j];
                    items[j] = items[j+1];
                    items[j+1] = tempItem;
                }
            }
        }
        
    }
    }