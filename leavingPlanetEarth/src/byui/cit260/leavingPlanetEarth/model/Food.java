/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.model;

import java.io.Serializable;
/**
 *
 * @author OptimusPrime
 */
public enum Food implements Serializable{
    Apples("These will give you energy"),
    Meat ("This will give you strength"),
    Water("This will give you hydration");
    
    // class instance variables
 private final String value;
    // class instance variables
    private String strengthGiving;
    private String energyGiving;
    private String hydrating;

    private Food(String value) {
        this.value = value;
    }
    
    public String getValue(){
    return value;
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

}
