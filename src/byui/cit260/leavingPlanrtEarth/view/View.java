/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanrtEarth.view;

import byui.cit260.leavingPlanetEarth.ViewInterface.ViewInterface;
import java.util.Scanner;

/**
 *
 * @author OptimusPrime
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        char selection = ' ';
        do {

            System.out.println();//display the main menu

            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string

            this.doAction(selection); // do action based on selection

        } while (selection != 'E'); // an slection is not "Exit"

    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        while (!valid) {

            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n*** You must enter a value ***");
                continue;
            }
            break;
        }
        return value;
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
