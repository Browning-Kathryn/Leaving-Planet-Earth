/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.leavingPlanetEarth.control;

import byui.cit260.leavingPlanrtEarth.model.Player;
import byui.cit260.leavingplanetEarth.model.Game;



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