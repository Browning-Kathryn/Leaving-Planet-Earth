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
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = leavingPlanetEarth.getinFile();
    protected final PrintWriter console = leavingPlanetEarth.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        char selection = ' ';
        do {

            this.console.println();//display the main menu

            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string

            this.doAction(selection); // do action based on selection

        } while (selection != 'E'); // an slection is not "Exit"

    }

    @Override
    public String getInput() {
        boolean valid = false;
        String value = null;
        try{
          
        while (!valid) {

            value=this.keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {
                this.console.println("\n*** You must enter a value ***");
                continue;
            }
            break;
        }
        } catch (Exception e){
            this.console.println("Error reading input:"+ e.getMessage());
        }
        return value;
    }
}
