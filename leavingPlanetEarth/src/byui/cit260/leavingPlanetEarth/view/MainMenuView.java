/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;

import byui.cit260.leavingPlanetEart.control.GameControl;
import byui.cit260.leavingPlanetEart.control.leavingPlanetEarth;
import java.util.Scanner;

/**
 *
 * @author OptimusPrime
 */
public class MainMenuView extends View {

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

    public void doAction(char selection) {

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
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }

    }

    private void startNewGame() {
        GameControl.createNewGame(leavingPlanetEarth.getPlayer());
 
        GameMenuView Menu = new GameMenuView();
        Menu.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView Menu = new HelpMenuView();
        Menu.display();
    }

    private void saveGame() {
        System.out.println("***saveGame function called ***");
    }

}
