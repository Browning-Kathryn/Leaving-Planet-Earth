/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;
import byui.cit260.leavingPlanetEarth.model.InventoryItem;
import java.io.BufferedReader;
import java.io.PrintWriter;
import leavingPlanetEarth.LeavingPlanetEarth;
/**
 *
 * @author OptimusPrime
 */
public class InventoryControl {
      protected final BufferedReader keyboard = LeavingPlanetEarth.getinFile();
    protected final PrintWriter console = LeavingPlanetEarth.getOutFile();
    public double calcFuelNeeded(double distance, double mpg, String fuel){
        if (distance <= 0){
        return -1;
    }
        if (mpg < 5 || mpg > 50){
            return -1;
           }
        try{
        distance=Double.parseDouble(fuel);
        } catch (NumberFormatException nf){
            this.console.println("\n You Must enter a valid number");
        }
         double gallons = Math.round((distance/mpg)*1000.0)/1000.0;
         
                 
         return gallons;
        
    }

    public double calcRations(double noPeople, double inventoryItem, String energy){
        if(noPeople <= 0){
            return-1;
        }
        if(inventoryItem < 1 || inventoryItem >100){
            return-1;
        }
        try{
        noPeople=Double.parseDouble(energy);
        } catch (NumberFormatException nf){
            this.console.println("\n You Must enter a valid number");
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