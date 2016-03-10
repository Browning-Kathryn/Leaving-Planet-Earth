
package byui.cit260.leavingPlanetEarth.model;

import java.io.Serializable;
/**
 *
 * @author OptimusPrime
 */
public enum Tools implements Serializable{
   Hammer("This will help you hammer nails"),
   Saw ("This will help you cut through items"),
   Nails("This will help you hold things together");
    
    // class instance variables
    private final String description;
  
  
    Tools(String description){
        this.description = description;
       
        
         }

    public String getDescription(){
        return description;
    }
 
    
}