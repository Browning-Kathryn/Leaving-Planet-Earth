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
import byui.cit260.leavingPlanetEarth.model.shelter;
import java.io.Serializable;

/**
 *
 * @author OptimusPrime
 */
public class Game implements Serializable {
    
    private double totalTime;
    private long noPeople;
    private buildRocket rocket;
    private Inventory[] inventory;
    private Player player;
    private String[] actors;
    private shelter shelter;
    private Map map;
    
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
    public Inventory[] getInventory(){
        return inventory;
    }
}
