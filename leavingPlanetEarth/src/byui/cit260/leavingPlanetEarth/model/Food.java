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
public class Food implements Serializable{
    
    // class instance variables
    private String strengthGiving;
    private String energyGiving;
    private String hydrating;

    public Food() {
    }
    
    

    public String getStrengthGiving() {
        return strengthGiving;
    }

    public void setStrengthGiving(String strengthGiving) {
        this.strengthGiving = strengthGiving;
    }

    public String getEnergyGiving() {
        return energyGiving;
    }

    public void setEnergyGiving(String energyGiving) {
        this.energyGiving = energyGiving;
    }

    public String getHydrating() {
        return hydrating;
    }

    public void setHydrating(String hydrating) {
        this.hydrating = hydrating;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.strengthGiving);
        hash = 29 * hash + Objects.hashCode(this.energyGiving);
        hash = 29 * hash + Objects.hashCode(this.hydrating);
        return hash;
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
        final Food other = (Food) obj;
        if (!Objects.equals(this.strengthGiving, other.strengthGiving)) {
            return false;
        }
        if (!Objects.equals(this.energyGiving, other.energyGiving)) {
            return false;
        }
        if (!Objects.equals(this.hydrating, other.hydrating)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Food{" + "strengthGiving=" + strengthGiving + ", energyGiving=" + energyGiving + ", hydrating=" + hydrating + '}';
    }
    
    
    
}
