/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leavingplanetearth;

import byui.cit260.leavingPlanetEarth.model.Desert;
import byui.cit260.leavingPlanetEarth.model.NASA;
import byui.cit260.leavingPlanetEarth.model.Player;
import byui.cit260.leavingPlanetEarth.model.StartLocation;

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
        
        
        
    }
    
    
   
}
   

