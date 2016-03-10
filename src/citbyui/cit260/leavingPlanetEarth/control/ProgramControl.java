/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.leavingPlanetEarth.control;

import byui.cit260.leavingPlanrtEarth.model.Player;

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

        leavingPlanetEarth.setPlayer(player);

        return player;
    }

    private static class leavingPlanetEarth {

        private static void setPlayer(Player player) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public leavingPlanetEarth() {
        }
    }

}
