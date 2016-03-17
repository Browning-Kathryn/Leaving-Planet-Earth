/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leavingplanetearth;

import byui.cit260.leavingPlanetEarth.model.Desert;
import byui.cit260.leavingPlanetEarth.model.Food;
import byui.cit260.leavingPlanetEarth.model.InventoryItem;
import byui.cit260.leavingPlanetEarth.model.NASA;
import byui.cit260.leavingPlanetEarth.model.Parts;
import byui.cit260.leavingPlanetEarth.model.Player;
import byui.cit260.leavingPlanetEarth.model.startingScene;
import byui.cit260.leavingPlanetEarth.model.Tools;
import byui.cit260.leavingPlanetEarth.view.StartProgramView;

/**
 *
 * @author OptimusPrime
 */
public class LeavingPlanetEarth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        try{
            
            startProgramView.displayBanner();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayBanner();
        }
    }
    
   
}
   

