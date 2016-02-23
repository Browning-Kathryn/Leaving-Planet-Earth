/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;

import byui.cit260.leavingPlanetEarth.model.Player;



/**
 *
 * @author OptimusPrime
 */
public class GameControl {

    public static int createNewGame(Player player) {
     if(player ==null){
         return -1;
     }
     Game game = new Game();
     
     return 1;
    }
   
    
}
