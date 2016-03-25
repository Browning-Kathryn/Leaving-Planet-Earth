/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import byui.cit260.leavingPlanetEart.control.leavingPlanetEarth;

/**
 *
 * @author OptimusPrime
 */
public class HelpMenuView extends View {
  protected final BufferedReader keyboard = leavingPlanetEarth.getinFile();
    protected final PrintWriter console = leavingPlanetEarth.getOutFile();
    public HelpMenuView() {
        super("\n"
                + "\n---------------------------------------------------"
                + "\n| Help Menu                                       |"
                + "\n---------------------------------------------------"
                + "\nM - How to Move"
                + "\nB - How to Build a Shelter"
                + "\nF - How to find pieces of the rocket ship & food"
                + "\nL - How losing an hour of sun each day effects game play"
                + "\nT - Time regulation of fifteen days"
                + "\nR - Return to Main Menu"
                + "\nE - Quit "
                + "\n----------------------------------------------------");

    }

    public void doAction(char selection) {

        switch (selection) {
            case 'M':
                this.startMove();
                break;
            case 'B':
                this.startBuildShelter();
                break;
            case 'F':
                this.startFind();
                break;
            case 'L':
                this.losingTime();
                break;
            case 'T':
                this.time();
                break;
            case 'R':
                this.returnMain();
                break;
            case 'E':
                return;
            default:
                this.console.println("\n*** Invalid selection *** Try Again");
                break;
        }

    }

    private void startMove() {
        this.console.println("\n*** You move through the board by using the arrow keys on your keyboard.");
    }

    private void startBuildShelter() {
        this.console.println("*** You can build the shelter using any tools and supplies that you have picked up along the way");
    }

    private void startFind() {
        this.console.println("*** You can find pieces of the rocket ship and food as you journey through the desert. They will be marked in various colors ***");
    }

    private void losingTime() {
        this.console.println("***Every day you lose one hour of sunshine and you cannot go outside at night or the game is over. You will need to plan your time accordingly. ***");
    }

    private void time() {
        this.console.println("You only have 15 days to solve the game. Move quickly or you may have to start over");
    }

    private void returnMain() {
        MainMenuView Menu = new MainMenuView();
        Menu.display();
    }

}
