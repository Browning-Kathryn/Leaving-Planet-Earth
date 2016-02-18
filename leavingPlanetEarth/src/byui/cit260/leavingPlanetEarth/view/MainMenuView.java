/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;

import byui.cit260.leavingPlanetEart.control.leavingPlanetEarth;

/**
 *
 * @author OptimusPrime
 */
public class MainMenuView {

    private final String MENU = "\n"
            +"\n---------------------------------------------------"
            +"\n| Main Menu                                       |"
            +"\n---------------------------------------------------"
            +"\nG - Start Game"
            +"\nH - Get help on how to play the game"
            +"\nS - Save game"
            +"\nE - Exit"
            +"\nN - New game"
            +"\n----------------------------------------------------";
    
    public void displayMenu(){
        
        char selection = ' ';
        do{
            
            System.out.println(MENU);//display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
        } while(selection != 'E'); // an slection is not "Exit"
        
          
    }

   
    
}
