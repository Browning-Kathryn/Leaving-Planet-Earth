/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;

import byui.cit260.leavingPlanetEart.control.GameControl;
import leavingPlanetEarth.LeavingPlanetEarth;
import byui.cit260.leavingPlanetEarth.exceptions.MapControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OptimusPrime
 */
public class MainMenuView extends View {
  protected final BufferedReader keyboard = LeavingPlanetEarth.getinFile();
    protected final PrintWriter console = LeavingPlanetEarth.getOutFile();
    public MainMenuView() {
        super("\n"
                + "\n---------------------------------------------------"
                + "\n| Main Menu                                       |"
                + "\n---------------------------------------------------"
                + "\nG - Start Game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nE - Exit"
                + "\nN - New game"
                + "\n----------------------------------------------------");

    }

    public boolean doAction(Object obj) {
         String value = (String) obj;
        value = value.toUpperCase(); // convert to all upper case
        char selection= value.charAt(0); 

        switch (selection) {
            case 'N':
              this.startNewGame();
                break;
            case 'G':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return true;
            default:
                ErrorView.display("MainMenuView","*** Invalid selection *** Try again");
                break;
        }
return false;
    }

    private void startNewGame()  {
       
        try{
            GameControl.createNewGame(LeavingPlanetEarth.getPlayer());
        }catch (MapControlException mce){
            ErrorView.display("MainMenuView", mce.getMessage());
            return;
        }
 
        GameMenuView Menu = new GameMenuView();
        Menu.display();
    }

    private void startExistingGame() {
        this.console.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView Menu = new HelpMenuView();
        Menu.display();
    }

    private void startSavedGame(){
        this.console.println("\n\nEnter the file path for file where the game"
                                + "is to be saved.");
        
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
        } catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                                + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            
            GameControl.saveGame(LeavingPlanetEarth.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

  

}
