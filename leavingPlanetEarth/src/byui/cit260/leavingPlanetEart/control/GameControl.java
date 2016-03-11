package byui.cit260.leavingPlanetEart.control;

import byui.cit260.leavingPlanetEarth.enums.Item;
import byui.cit260.leavingPlanetEarth.model.InventoryItem;
import byui.cit260.leavingPlanetEarth.model.Map;
import byui.cit260.leavingPlanetEarth.model.Player;
import byui.cit260.leavingPlanetEarth.model.buildRocket;
import byui.cit260.leavingPlanetEarth.model.shelter;
import byui.cit260.leavingPlanetEarth.enums.Actor;
import byui.cit260.leavingPlanetEarth.model.Game;
import byui.cit260.leavingPlanetEarth.model.Location;
import java.awt.Point;
import javafx.scene.Scene;

/**
 *
 * @author OptimusPrime
 */
public class GameControl {

    public GameControl() {
    }

    public static void createNewGame(Player player) {

        Game game = new Game();
        leavingPlanetEarth.setCurrentGame(game);

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
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t"
                + "Required" + "\t"
                + "In Stock");

        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() + "\t   "
                    + inventoryItem.getRequireAmount() + "\t   "
                    + inventoryItem.getQuantityInStock());

        }
    }

    public static InventoryItem[] getSortedInventoryList() {
        System.out.println("\n**** getSortedInventoryList stub function called ***");
        return null;
    }
    
    public static Location[][] getMapLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
