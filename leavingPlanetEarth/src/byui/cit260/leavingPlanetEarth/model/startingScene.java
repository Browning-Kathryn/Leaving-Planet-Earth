/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author OptimusPrime
 */
public class startingScene implements Serializable {
    
    // class instance variables
    private String description;
    private double travelTime;
    private String MapSymbol;

    public startingScene() {
    }

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }
     public String getMapSymbol() {
        return MapSymbol;
    }

    public void setMapSymbol(String mapsymbol) {
        this.MapSymbol = mapsymbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "StartLocation{" + "description=" + description + ", travelTime=" + travelTime + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final startingScene other = (startingScene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
        
        
    }
    
    
    
}
