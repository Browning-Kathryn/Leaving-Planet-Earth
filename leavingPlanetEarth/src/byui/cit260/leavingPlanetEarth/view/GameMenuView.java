/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;

import byui.cit260.leavingPlanetEart.control.GameControl;
import byui.cit260.leavingPlanetEarth.model.Location;
import byui.cit260.leavingPlanetEarth.model.Scene;
import byui.cit260.leavingPlanetEart.control.InventoryControl;
import byui.cit260.leavingPlanetEart.control.MapControl;
import byui.cit260.leavingPlanetEarth.enums.Actor;
import byui.cit260.leavingPlanetEarth.exceptions.MapControlException;
import byui.cit260.leavingPlanetEarth.model.Game;
import byui.cit260.leavingPlanetEarth.model.InventoryItem;
import byui.cit260.leavingPlanetEarth.view.MapView;
import java.awt.Point;
import java.io.PrintWriter;

/**
 *
 * @author OptimusPrime
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n---------------------------------------------------"
                + "\n| Game Menu                                       |"
                + "\n---------------------------------------------------"
                + "\nV - View Map"
                + "\nC - Construct Shelter"
                + "\nI - View inventory for food"
                + "\nX - Check progress on a rocket ship"
                + "\nM - Move Person"
                + "\nS - Sleep"
                + "\nP - Pack rocket ship"
                + "\nL - Launch rocket ship"
                + "\nH - Help"
                + "\nW - Work on rocket ship"
                + "\nT - Use a tool"
                + "\nB - Look at tool belt and select tool"
                + "\nG - Gather supplies"
                + "\nO - Pick up Object"
                + "\nR - Return"
                + "\nE - Quit "
                + "\n----------------------------------------------------");

    }

    @Override
    public void doAction(char selection) {
      Actor actor = null;
        Game game = null;
        Point position = null;
try{
    MapControl.moveActorToLocation(game, actor,position);
} catch (MapControlException me){
    System.out.println(me.getMessage());
}
        switch (selection) {
            case 'V':
                this.viewMap();
                break;
            case 'C':
                this.constructShelter();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'X':
                this.checkProgress();
                break;
            case 'M':
                this.movePerson();
                break;
            case 'S':
                this.startSleep();
                break;
            case 'P':
                this.packShip();
                break;
            case 'L':
                this.launchShip();
                break;
            case 'H':
                this.returnHelp();
                break;
            case 'W':
                this.workOnShip();
                break;
            case 'T':
                this.useTool();
                break;
            case 'B':
                this.seeBelt();
                break;
            case 'G':
                this.gatherSupplies();
                break;
            case 'O':
                this.object();
                break;
            case 'R':
                this.returnMain();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }

    }

    private void viewMap(PrintWriter out) {

        Location[][] locations = GameControl.getMapLocations();
        int columnCount = locations[0].length;

        this.printTitle(out, columnCount, "Leaving Planet Earth");
        this.printColumnHeaders(out, columnCount);

        for (int i = 0; i < locations.length; i++) {
            Location[] rowLocations = locations[i];
            this.printRowDivider(out, columnCount);
            out.println();
            if (i < 9) {
                out.print(" " + (i + 1));
            } else {
                out.print(i + 1);
            }

            for (int column = 0; column < columnCount; column++) {
                out.print("|");
                Location location = rowLocations[column];
                if (location != null && location.isVisited()) {
                    Scene scene = location.getScene();
                    if (scene != null) {
                        out.print(scene.getMapSymbol());
                    } else {
                        out.print(" ");
                    }

                } else {
                    out.print(" ??");
                }
            }
            out.print("|");
        }

        this.printRowDivider(out, columnCount);

    }

    private void printColumnHeaders(PrintWriter out, int columnCount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void printTitle(PrintWriter out, int columnCount, String leaving_Planet_Earth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void printRowDivider(PrintWriter out, int columnCount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void constructShelter() {
        System.out.println("*** Construct Shelter");
    }

    private void viewInventory() {
        InventoryItem[] items = null;
        InventoryControl.sortByDescription(items);
   
   
    }

    private void checkProgress() {
        System.out.println("*** Check Progress ***");
    }

    private void movePerson() {
        MovePersonView Menu = new MovePersonView();
        Menu.display();
    }

    private void startSleep() {
        System.out.println("*** Start Sleep ***");
    }

    private void packShip() {
        System.out.println("*** Pack Ship ***");
    }

    private void launchShip() {
        System.out.println("*** Launch Ship ***");
    }

    private void returnHelp() {
        HelpMenuView Menu = new HelpMenuView();
        Menu.display();
    }

    private void workOnShip() {
        System.out.println("*** Work on Ship ***");
    }

    private void useTool() {
        System.out.println("** Use Tools ***");
    }

    private void seeBelt() {
        System.out.println("*** See tool belt ***");
    }

    private void gatherSupplies() {
        System.out.println("*** Gather Supplies ***");
    }

    private void object() {
        System.out.println("*** Pick up object ***");
    }

    private void returnMain() {
        MainMenuView Menu = new MainMenuView();
        Menu.display();
    }

    private void viewMap() {
      MapView Menu = new MapView();
     
      
    }

}
