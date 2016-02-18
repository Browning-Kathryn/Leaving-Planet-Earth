/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;

import byui.cit260.leavingPlanetEart.control.GameControl;
import byui.cit260.leavingPlanetEart.control.ProgramControl;
import byui.cit260.leavingPlanetEarth.model.Player;
import java.util.Scanner;

/**
 *
 * @author OptimusPrime
 */
public class StartProgramView {

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
       MainMenuView mainMenu =  new MainMenuView();
       mainMenu.displayMenu();
    }

    public void displayBanner() {
        System.out.println("\n\n*******************************************");

        System.out.println("*                                            *"
                + "\n* This is the game of Leaving Planet Earth          *"
                + "\n* In this game you will travel with your            *"
                + "\n* fellow astronauts through dangerous terrain       *"
                + "\n* to Nasa headquarters, and then the planet Nefthtar*");

        System.out.println("*                                            *"
                + "\n* Planet Earth is dying.You must leave or you will   *"
                + "\n* die too. You have 5 days to travel to NASA and     *"
                + "\n* once you're there you will have 15 days to build a *"
                + "\n* rocket and take your crew to planet Nefhtar. On    *"
                + "\n* your journey you will find the supplies and tools  *"
                + "\n* you need to survive and build your ship. Be warned:*"
                + "\n* there are severe storms at night that will kill you.*"
                + "\n* You may only work during the day and as the Earth  *"
                + "\n* gets sicker the days get shorter.                  *");

        System.out.println("*                                            *"
                + "\n* Good luck and if all goes well we will see you on  *"
                + "\n*  Planet Nefthtar                                    *"
                + "n*                                                     *");

        System.out.println("**********************************************");

    }

    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {

            System.out.println("Enter the player's name below:");

            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue;
            }
            break;
        }
        return playersName;
    }
    
    public void displayWelcomeMessage (Player player){
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("=================================================");
    }
      
        
    
      
     
     

   
}
