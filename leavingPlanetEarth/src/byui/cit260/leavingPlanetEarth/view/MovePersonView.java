/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;

import byui.cit260.leavingPlanetEart.control.MapControl;
import leavingPlanetEarth.LeavingPlanetEarth;
import byui.cit260.leavingPlanetEarth.exceptions.MapControlException;
import byui.cit260.leavingPlanetEarth.enums.Actor;
import byui.cit260.leavingPlanetEarth.model.Game;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author OptimusPrime
 */
public class MovePersonView extends View {
  protected final BufferedReader keyboard = LeavingPlanetEarth.getinFile();
    protected final PrintWriter console = LeavingPlanetEarth.getOutFile();
    public MovePersonView() {
        super("\n"
                + "\n---------------------------------------------------"
                + "\n| Where would you like to go?                     |"
                + "\n---------------------------------------------------"
                + "\nD - Desert"
                + "\nN - Nasa"
                + "\nP - Planet Nefthar"
                + "\nR - Return to Main Menu"
                + "\nE - Quit "
                + "\n----------------------------------------------------");
    }

    public void doAction(char selection) {
        Actor actor = null;
        Game game = null;
        Point position = null;
try{
    MapControl.moveActorToLocation(game, actor,position);
} catch (MapControlException me){
    this.console.println(me.getMessage());
}
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
            case 'E':
                return;
            default:
                this.console.println("\n*** Invalid selection *** Try Again");
                break;
        }

    }

    private void Desert() {
        this.console.println("\n*** Welcome to the desert.You must spend your time here collecting parts and tools to build your rocket.");
    }

    private void Nasa() {
        this.console.println("*** Welcome to Nasa. Start building your rocket right away. Time is running out for you to reach Planet Nefthar");
    }

    private void planetNefthar() {
        this.console.println("*** Welcom to Planet Nefthar. You made it!***");
    }

    private void returnMain() {
        MainMenuView Menu = new MainMenuView();
        Menu.display();
    }

}
