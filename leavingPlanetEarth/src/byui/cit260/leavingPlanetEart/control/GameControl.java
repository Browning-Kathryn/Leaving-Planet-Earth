/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;

import byui.cit260.leavingPlanetEarth.model.Inventory;
import byui.cit260.leavingPlanetEarth.model.Map;
import byui.cit260.leavingPlanetEarth.model.Player;
import byui.cit260.leavingPlanetEarth.model.buildRocket;



/**
 *
 * @author OptimusPrime
 */
public class GameControl {

    public static void createNewGame(Player player) {
     
     Game game = new Game();
     leavingPlanetEarth.setCurrentGame(game);
     
     game.setPlayer(player);
     
     Inventory[] inventoryList = GameControl.createInventoryList();
     game.setInventory(inventoryList);
     
     buildRocket rocket = new Rocket();
     game.setRocket(rocket);
   
     Shelter shelter = new Shelter();
     game.setShelter(shelter);
     
     Map map = MapControl.createMap();
     game.setMap(map);
     
     MapControl.moveActorsToStartingLocation(map);
    
}
    public static Inventory[] createInventoryList(){
        Inventory[] inventory = 
                new Inventory[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        Inventory food = new Inventory();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        inventory[Item.food.ordinal()] = food;
        
        Inventory tools = new Inventory();
        tools.setDescription("Tools");
        tools.setQuantityInStock(0);
        tools.setRequiredAmount(0);
        inventory[Item.tools.ordinal()] = tools;
        
        Inventory parts = new Inventory();
        parts.setDescription("Parts");
        parts.setQuantityInStock(0);
        parts.setRequiredAmount(0);
        inventory[Item.parts.ordinal()] = parts;
        
        return inventory;
    }
}