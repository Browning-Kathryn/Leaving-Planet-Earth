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
public abstract class getInputforShelter extends View {

    public getInputforShelter() {
        super("\n"
                + "\n---------------------------------------------------"
                + "\n| What will you use to build a shelter?           |"
                + "\n---------------------------------------------------"
                + "\nW - Wood"
                + "\nP - Rocks"
                + "\nS - Sand"
                + "\nR - Return to Main Menu"
                + "\nE - Quit "
                + "\n----------------------------------------------------");
    }

    public void doAction(char selection) {

        switch (selection) {
            case 'W':
                this.Wood();
                break;
            case 'P':
                this.Rocks();
                break;
            case 'S':
                this.Sand();
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

}
