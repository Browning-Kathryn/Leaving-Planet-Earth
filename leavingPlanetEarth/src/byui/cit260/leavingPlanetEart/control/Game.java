/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;

import byui.cit260.leavingPlanetEarth.model.InventoryItem;
import byui.cit260.leavingPlanetEarth.model.Map;
import byui.cit260.leavingPlanetEarth.model.Player;
import byui.cit260.leavingPlanetEarth.model.buildRocket;
import byui.cit260.leavingPlanetEarth.model.shelter;
import byui.cit260.leavingPlanetEarth.model.Scene;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author OptimusPrime
 */
public class Game implements Serializable {
    
    private double totalTime;
    private long noPeople;
    private buildRocket rocket;
    private InventoryItem[] inventory;
    private Player player;
    private String[] actors;
    private shelter shelter;
    private Map map;
    private Scene scene;
    
    public Game(){    
    }
    
    public double getTotalTime(){
        return totalTime;
    }
    public void setTotalTime(double totalTime){
        this.totalTime = totalTime;
    }
    public buildRocket getRocket(){
        return rocket;
    }
    public void setRocket(buildRocket rocket) {
        this.rocket = rocket;
    }
    public InventoryItem[] getInventory(){
        return inventory;
    }
    public InventoryItem[] setInventory(){
        this.inventory = inventory;
        
        return inventory;
    }
    public Player getPlayer(){
        return player;
    }
    public void setPlayer(Player player){
        this.player = player;
    }
    public String[] getActors(){
        return actors;
    }
    public String[] setActors(){
        this.actors = actors;
        return actors;
    }
    public shelter getShelter(){
        return shelter;
    }
    public void setShelter(shelter shelter){
        this.shelter = shelter;
    }
    public Map getMap(){
        return map;
}
    public void setMap(Map map){
        this.map = map;
    }
    
    public Scene getScene(){
        return scene;
    }
    public void setScene(Scene scene){
        this.scene = scene;
    }

    Point[] getActorsLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
