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
public enum Food implements Serializable{
    Apples ("These will give you energy"),
    Meat ("This will give you strength"),
    Water("This will give you hydration");
    
    // class instance variables
    private final String strengthGiving;
    private final String energyGiving;
    private final String hydrating;

  
    Food(String Description){
        this.strengthGiving = ;
        this.energyGiving = ;
        this.hydrating = ;
    }

    public String getStrengthGiving() {
        return strengthGiving;
    }

 
    public String getEnergyGiving() {
        return energyGiving;
    }

 

    public String getHydrating() {
        return hydrating;
    }

   
    
    
    
    
}
