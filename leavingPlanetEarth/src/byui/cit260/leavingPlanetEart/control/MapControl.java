/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;

import byui.cit260.leavingPlanetEarth.model.Map;
import javafx.scene.Scene;

/**
 *
 * @author OptimusPrime
 */
public class MapControl {
    public static Map createMap(){
        Map map = new Map (20,20);
        
        Scene[] scenes = createScenes();
        
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
}
