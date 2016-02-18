/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;

import byui.cit260.leavingPlanetEarth.model.Player;

import byui.cit260.leavingPlanetEarth.view.StartProgramView;

/**
 *
 * @author OptimusPrime
 */
public class leavingPlanetEarth {
    private static Game currentGame=null;
    private static Player player=null;
    private static Input input = null;
    
    public static void main (String[] args){
      
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.startProgram();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        leavingPlanetEarth.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        leavingPlanetEarth.player = player;
    }

    public static void getInput(){
       
    }
    public static void setInput(Input input) {
        leavingPlanetEarth.input = input;
    }
    
}
