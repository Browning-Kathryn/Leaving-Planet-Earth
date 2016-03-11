package byui.cit260.leavingPlanetEarth.model;

import java.io.Serializable;

public class Game implements Serializable {
    
    private double totalTime;
    
    private Player player;
    private Map map;
    private buildRocket rocket;
    private InventoryItem[] inventory;
    
    public Game () {
        this.totalTime = 0;
    }
    
    public double getTotalTime() {
        return totalTime;
    }
    
    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
    
    public buildRocket getRocket() {
        return rocket;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
