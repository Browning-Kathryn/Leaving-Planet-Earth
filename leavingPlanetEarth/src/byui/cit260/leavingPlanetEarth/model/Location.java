/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.model;

import byui.cit260.leavingPlanetEarth.enums.Actor;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author OptimusPrime
 */
public class Location implements Serializable {
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Actor> actors;

    public Location(int row, int column, Scene scene) {
        this.row = row;
        this.column = column;
        this.visited = false;
        this.scene = scene;
    }
    
    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    public Location() {
        this.actors = new ArrayList<Actor>();
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
}
