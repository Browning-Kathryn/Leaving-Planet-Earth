/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEart.control;
import leavingPlanetEarth.LeavingPlanetEarth;
import byui.cit260.leavingPlanetEarth.model.Player;

/**
 *
 * @author OptimusPrime
 */
public class ProgramControl {

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
      

        LeavingPlanetEarth.setPlayer(player);

        return player;
    }

}
