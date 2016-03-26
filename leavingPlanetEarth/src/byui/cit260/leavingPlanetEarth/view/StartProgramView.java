/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;

import byui.cit260.leavingPlanetEart.control.GameControl;
import byui.cit260.leavingPlanetEart.control.ProgramControl;
import leavingPlanetEarth.LeavingPlanetEarth;
import byui.cit260.leavingPlanetEarth.model.Player;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author OptimusPrime
 */
public class StartProgramView {
     protected final BufferedReader keyboard = LeavingPlanetEarth.getinFile();
    protected final PrintWriter console = LeavingPlanetEarth.getOutFile();

    public StartProgramView() {

    }

    public void startProgram() {

//Display the banner screen 
        this.displayBanner();

        //prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();

        //create and save the player object
        Player player = ProgramControl.createPlayer(playersName);

        //display a personalized welcome message this.displayWelcomeMessage(player);
        this.displayWelcomeMessage(player);

        //Display the main menu.
        MainMenuView Menu = new MainMenuView();
        Menu.display();
    }

    public void displayBanner() {
        this.console.println("\n\n*******************************************");

        this.console.println("*                                            *"
                + "\n* This is the game of Leaving Planet Earth          *"
                + "\n* In this game you will travel with your            *"
                + "\n* fellow astronauts through dangerous terrain       *"
                + "\n* to Nasa headquarters, and then the planet Nefthtar*");

        this.console.println("*                                            *"
                + "\n* Planet Earth is dying.You must leave or you will   *"
                + "\n* die too. You have 5 days to travel to NASA and     *"
                + "\n* once you're there you will have 15 days to build a *"
                + "\n* rocket and take your crew to planet Nefhtar. On    *"
                + "\n* your journey you will find the supplies and tools  *"
                + "\n* you need to survive and build your ship. Be warned:*"
                + "\n* there are severe storms at night that will kill you.*"
                + "\n* You may only work during the day and as the Earth  *"
                + "\n* gets sicker the days get shorter.                  *");

        this.console.println("*                                            *"
                + "\n* Good luck and if all goes well we will see you on  *"
                + "\n*  Planet Nefthtar                                    *"
                + "n*                                                     *");

        this.console.println("**********************************************");

    }

    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
       try{

        while (!valid) {

            playersName = this.keyboard.readLine();
            playersName = playersName.trim();

            if (playersName.length() < 2) {
                this.console.println("Invalid name - the name must not be blank");
                continue;
            }
            break;
        }
       }catch (Exception e){
           this.console.println("Errore reading input:" + e.getMessage());
       }
        return playersName;
    }

    protected void displayWelcomeMessage(Player player) {
       this.console.println("\n\n=============================================");
        this.console.println("\tWelcome to the game " + player.getName());
        this.console.println("\tWe hope you have a lot of fun!");
       this.console.println("=================================================");
    }

}
