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
public class GameMenuView extends View {
    public GameMenuView(){
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
    
    
     
     
   
    public void doAction(char selection) {

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
    
    private void viewMap() {
        System.out.println("\n*** View Map.");
    }

    private void constructShelter() {
        System.out.println("*** Construct Shelter");
    }

    private void viewInventory() {
        System.out.println("*** View Inventory ***");
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
    
}
