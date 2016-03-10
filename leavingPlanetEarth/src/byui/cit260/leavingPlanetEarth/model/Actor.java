/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author OptimusPrime
 */
public enum Actor implements Serializable {
    Garret("He is the Fearless Captain and leader"),
    Sara("She is the engine specialist and Garret's girlfriend"),
    Abraham("He is the weapon specialist"),
    Josephine("She is the medical specialist");

    
    private final String description;
    private final Point coordinates;
    
 
    Actor(String description){
        this.description = description;
        coordinates = new Point(1,1);
    }
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
