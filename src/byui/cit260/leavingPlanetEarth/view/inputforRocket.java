/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;


/**
 *
 * @author OptimusPrime
 */
public abstract class inputforRocket extends View {

    public inputforRocket() {
        super("\n"
                + "\n---------------------------------------------------"
                + "\n| Time to build your Rocket Ship                  |"
                + "\n---------------------------------------------------"
                + "\nT - Select a Tool"
                + "\nP - Insert Door"
                + "\nC - Select paint color"
                + "\nV - Insert Engine"
                + "\nI - Insert chair"
                + "\nW - Insert window"
                + "\nS - Put up a shelf"
                + "\nG - Insert gas tank"
                + "\nA - Fill gas tank"
                + "\nL - Insert Part"
                + "\nM - Insert Metal Panel"
                + "\nR - Return to Main Menu"
                + "\nE - Quit "
                + "\n----------------------------------------------------");
    }

    public void doAction(char selection) {

        switch (selection) {
            case 'T':
                this.Tool();
                break;
            case 'P':
                this.Door();
                break;
            case 'C':
                this.Selectpaintcolor();
                break;
            case 'V':
                this.InsertEngine();
                break;
            case 'I':
                this.Insertchair();
                break;
            case 'W':
                this.Insertwindow();
                break;
            case 'S':
                this.Putupashelf();
                break;
            case 'G':
                this.Insertgastank();
                break;
            case 'A':
                this.Fillgastank();
                break;
            case 'L':
                this.Insertpart();
                break;
            case 'M':
                this.InsertMetalPanel();
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

    private void Wood() {
        System.out.println("\n*** Scavange the surrounding area for bits of wood to construct the wall for your shelter. Hurry before the sun goes down.");
    }

    private void Rocks() {
        System.out.println("*** Scavnage the surrounding area for large rocks that will hold down your shelter incase a sandstorm comes during the night.");
    }

    private void Sand() {
        System.out.println("*** Use your hands to dig a shelter from the sand dunes in the desert.");
    }

    private void returnMain() {
        MainMenuView Menu = new MainMenuView();
        Menu.display();
    }

    private void Tool() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Door() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Selectpaintcolor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void InsertEngine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Insertchair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Insertwindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Putupashelf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Insertgastank() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Fillgastank() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Insertpart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void InsertMetalPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
