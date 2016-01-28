/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leavingplanetearth;

import byui.cit260.leavingPlanetEarth.model.Desert;
import byui.cit260.leavingPlanetEarth.model.Inventory;
import byui.cit260.leavingPlanetEarth.model.NASA;
import byui.cit260.leavingPlanetEarth.model.Parts;
import byui.cit260.leavingPlanetEarth.model.Player;
import byui.cit260.leavingPlanetEarth.model.StartLocation;
import byui.cit260.leavingPlanetEarth.model.Tools;

/**
 *
 * @author OptimusPrime
 */
public class LeavingPlanetEarth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne= new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
  

       StartLocation locationOne= new StartLocation();
        
        locationOne.setDescription("Base Of Mountains");
        locationOne.setTravelTime(7.00);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        
        
        Desert desertOne = new Desert();
        
        desertOne.setDescription("arid and sandy");
        desertOne.setResourceType("Food");
        desertOne.setHazards("Sand Storms");
        desertOne.setTravelTime(12.00);
        desertOne.setAmountAvailable(5.00);
        
        String desertInfo = desertOne.toString();
        System.out.println(desertInfo);
        
        
        
        NASA nasaOne = new NASA();
        
        nasaOne.setDescription("Huge grey building with thousands of windows");
        nasaOne.setResourceType("Tools");
        nasaOne.setHazards("lightning Storms and Solar Bursts");
        nasaOne.setTravelTime(1.00);
        nasaOne.setAmountAvailable(2.00);
        
        String nasaInfo = nasaOne.toString();
        System.out.println(nasaInfo);
        
        
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setInventoryType("Tools");
        inventoryOne.setQuantityInStock(300.00);
        inventoryOne.setRequireAmount(5.00);
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        
        
        Tools toolsOne = new Tools();
        toolsOne.setAttachingPower(5.00);
        toolsOne.setCuttingPower(5.00);
        toolsOne.setCarryingPower(8.00);
        toolsOne.setDiggingPower(4.00);
        
        String toolsInfo = toolsOne.toString();
        System.out.println(toolsInfo);
        
        
        Parts partsOne = new Parts();
        partsOne.setPowerSource("fuel");
        partsOne.setLiftPower(100.00);
        
        String partsInfo = partsOne.toString();
        System.out.println(partsInfo);
    }
    
    
   
}
   

