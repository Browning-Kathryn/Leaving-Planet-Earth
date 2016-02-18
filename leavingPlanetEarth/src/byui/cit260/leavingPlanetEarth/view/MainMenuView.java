/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;


import byui.cit260.leavingPlanetEart.control.leavingPlanetEarth;
import java.util.Scanner;
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

   

   public String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {

            System.out.println("Select your menu option:");

            input = keyboard.nextLine();
            input = input.trim();

            if (input !="H" && input!="G" && input!="S" && input !="E" && input !="N"){
                System.out.println("Invalid Entry - Must choose from Menu options");
                continue;
            }
            break;
   
        }
        return input;
   }
   
        
        
   
    public void doAction(char choice){
         
         switch (choice){
             case'N':
                 this.startNewGame();
                 break;
             case 'G':
                 this.startExistingGame();
                 break;
             case 'H':
                 this.displayHelpMenu();
                 break;
             case'S':
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
        System.out.println("*** startNewGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("***saveGame function called ***");
    }
      
   
    
}
