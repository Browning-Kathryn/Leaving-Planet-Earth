/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;

import java.util.Scanner;

/**
 *
 * @author OptimusPrime
 */
public class MovePersonView {
    
     private final String MENU = "\n"
            + "\n---------------------------------------------------"
            + "\n| Where would you like to go?                     |"
            + "\n---------------------------------------------------"
            + "\nD - Desert"
            + "\nN - Nasa"
            + "\nP - Planet Nefthar"
            + "\nR - Return to Main Menu"
            + "\nQ - Quit "
            + "\n----------------------------------------------------";

      public void displayMenu() {

        char selection = ' ';
        do {

            System.out.println(MENU);//display the main menu

            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string

            this.doAction(selection); // do action based on selection

        } while (selection != 'E'); // an slection is not "Exit"

    }

    public String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {

            System.out.println("Select your menu option:");

            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("Invalid Entry - Must not be blank");
         
           
                continue;
            }
            break;

        }
        return input;
    }
    public void doAction(char selection) {

        switch (selection) {
            case 'D':
                this.Desert();
                break;
            case 'N':
                this.Nasa();
                break;
            case 'P':
                this.planetNefthar();
                break;
            case 'R':
                this.returnMain();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }

    } 
    
      private void Desert() {
        System.out.println("\n*** Welcome to the desert.You must spend your time here collecting parts and tools to build your rocket.");
    }

    private void Nasa() {
        System.out.println("*** Welcome to Nasa. Start building your rocket right away. Time is running out for you to reach Planet Nefthar");
    }

    private void planetNefthar() {
        System.out.println("*** Welcom to Planet Nefthar. You made it!***");
    }

    private void returnMain() {
        MainMenuView Menu = new MainMenuView();
        Menu.displayMenu();
    }
    
    
    
}
