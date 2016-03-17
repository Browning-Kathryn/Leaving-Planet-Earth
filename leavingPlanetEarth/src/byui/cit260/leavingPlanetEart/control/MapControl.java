package byui.cit260.leavingPlanetEart.control;

import byui.cit260.leavingPlanetEarth.model.Game;
import byui.cit260.leavingPlanetEarth.model.Map;
import byui.cit260.leavingPlanetEarth.enums.SceneType;
import byui.cit260.leavingPlanetEarth.model.Location;
import byui.cit260.leavingPlanetEarth.model.Scene;
import byui.cit260.leavingPlanetEarth.enums.Actor;
import byui.cit260.leavingPlanetEarth.exceptions.MapControlException;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author OptimusPrime
 */
public class MapControl {

    public static Map createMap() {

        Map map = new Map(20, 20); // decide how big you really want this thing     
        Scene[] scenes = createScenes();
        assignScenesToLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        Game game = leavingPlanetEarth.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\n Earth is dying.There are constant electrical storms,horrendous winds,"
                + "and almost all of the vegetation has withered away. The once beautiful"
                + "Earth has become a dry and dreary wasteland");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\nYou have made it through the desert and all the electrical storms alive"
                + "that was no easy task. You're now safely in your rocket and off to your "
                + "new planet Nefthar.");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;

        Scene desertScene = new Scene();
        desertScene.setDescription(
                "\nYou are in the desert.");
        desertScene.setMapSymbol("DS");
        desertScene.setBlocked(false);
        desertScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.desert.ordinal()] = desertScene;

        Scene shelterScene = new Scene();
        shelterScene.setDescription(
                "\nYou are in a sheleter.");
        shelterScene.setMapSymbol("SH");
        shelterScene.setBlocked(false);
        shelterScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.shelter.ordinal()] = shelterScene;

        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.shelter.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.NASA.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.Rocket.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.Nefthar.ordinal()]);

    }

    public static void moveActorsToStartingLocation(Map map, Actor[] actors) 
                    throws MapControlException{
        Game game = leavingPlanetEarth.getCurrentGame();
        for (Actor actor : actors) {
            Point position = new Point(2, 2);
            game.getActorsLocation()[actor.ordinal()] = new Point();
           MapControl.moveActorToLocation(game, actor, position);
        
        }
       
    }

    private static void moveActorToLocation(Game game, Actor actor, Point position)
                    throws MapControlException{
        Map map =leavingPlanetEarth.getCurrentGame().getMap();
        int newRow = position.x-1;
        int newColumn = position.y-1;
        
        if(newRow < 0 || newRow >= map.getRowCount() ||
                newColumn < 0 || newColumn >= map.getColumnCount()) {
            
            throw new MapControlException("Can not move actor to location"
                                          + position.x + "," + position.y
                                          + " because that location is outside"
                                          + " the bounds of the map");
            
        }
   
    }

 
}
