package byui.cit260.leavingPlanetEart.control;

import byui.cit260.leavingPlanetEarth.enums.Item;
import byui.cit260.leavingPlanetEarth.model.InventoryItem;
import byui.cit260.leavingPlanetEarth.model.Map;
import byui.cit260.leavingPlanetEarth.model.Player;
import byui.cit260.leavingPlanetEarth.model.buildRocket;
import byui.cit260.leavingPlanetEarth.model.shelter;
import byui.cit260.leavingPlanetEarth.enums.Actor;
import byui.cit260.leavingPlanetEarth.exceptions.GameControlException;
import byui.cit260.leavingPlanetEarth.exceptions.MapControlException;
import byui.cit260.leavingPlanetEarth.model.Game;
import byui.cit260.leavingPlanetEarth.model.Location;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javafx.scene.Scene;
import leavingPlanetEarth.LeavingPlanetEarth;

/**
 *
 * @author OptimusPrime
 */
public class GameControl {

   
  protected final BufferedReader keyboard = LeavingPlanetEarth.getinFile();
    protected final PrintWriter console = LeavingPlanetEarth.getOutFile();
    public GameControl() {
    }
     public static void saveGame(Game game, String filePath) 
        throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    }
    
     public static void getSavedGame(String filepath)
                throws GameControlException{
         Game game = null;
         
         try(FileInputStream fips = new FileInputStream(filepath)) {
             ObjectInputStream input = new ObjectInputStream(fips);
             
             game = (Game) input.readObject();
         }
         catch(Exception e){
             throw new GameControlException(e.getMessage());
         }
     }

    public static void createNewGame(Player player)
        throws MapControlException{

        Game game = new Game();
        LeavingPlanetEarth.setCurrentGame(game);

        game.setPlayer(player);

        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        buildRocket rocket = new buildRocket();
        game.setRocket(rocket);

        shelter shelter = new shelter();
        game.setShelter(shelter);

        Map map = MapControl.createMap();
        game.setMap(map);

        Actor[] actors = Actor.values();

        MapControl.moveActorsToStartingLocation(map, actors);

    }
 

    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[10]; // This magic number should be a contstant

        InventoryItem hammer = new InventoryItem();
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequireAmount(0);
        inventory[Item.hammer.ordinal()] = hammer;

        InventoryItem saw = new InventoryItem();
        saw.setDescription("Saw");
        saw.setQuantityInStock(0);
        saw.setRequireAmount(0);
        inventory[Item.saw.ordinal()] = saw;

        InventoryItem nails = new InventoryItem();
        nails.setDescription("Nails");
        nails.setQuantityInStock(0);
        nails.setRequireAmount(0);
        inventory[Item.nails.ordinal()] = nails;

        InventoryItem apple = new InventoryItem();
        apple.setDescription("Apple");
        apple.setQuantityInStock(0);
        apple.setRequireAmount(0);
        inventory[Item.apple.ordinal()] = apple;

        InventoryItem meat = new InventoryItem();
        meat.setDescription("Meat");
        meat.setQuantityInStock(0);
        meat.setRequireAmount(0);
        inventory[Item.meat.ordinal()] = meat;

        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequireAmount(0);
        inventory[Item.water.ordinal()] = water;

        InventoryItem engine = new InventoryItem();
        engine.setDescription("Engine");
        engine.setQuantityInStock(0);
        engine.setRequireAmount(0);
        inventory[Item.engine.ordinal()] = engine;

        InventoryItem window = new InventoryItem();
        window.setDescription("Window");
        window.setQuantityInStock(0);
        window.setRequireAmount(0);
        inventory[Item.window.ordinal()] = window;

        InventoryItem gastank = new InventoryItem();
        gastank.setDescription("Gastank");
        gastank.setQuantityInStock(0);
        gastank.setRequireAmount(0);
        inventory[Item.gastank.ordinal()] = gastank;

        return inventory;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
      this.console.println("\nList of Inventory Items");
        this.console.println("Description" + "\t"
                + "Required" + "\t"
                + "In Stock");

        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getDescription() + "\t   "
                    + inventoryItem.getRequireAmount() + "\t   "
                    + inventoryItem.getQuantityInStock());

        }
    }

    public static InventoryItem[] getSortedInventoryList() {
        System.out.println("\n**** getSortedInventoryList stub function called ***");
        return null;
    }
    
    public static Location[][] getMapLocations() {
     System.out.println("\n**** getSortedInventoryList stub function called ***");
        return null;  
    }
}
