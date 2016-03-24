/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leavingplanetearth;

import jdk.internal.util.xml.impl.Input;
import byui.cit260.leavingPlanetEarth.model.Game;
import byui.cit260.leavingPlanetEarth.model.Player;

import byui.cit260.leavingPlanetEarth.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;


/**
 *
 * @author OptimusPrime
 */
public class leavingPlanetEarth{

    private static Game currentGame = null;
    private static Player player = null;
    private static Input input = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static void main(String[] args){
     try {

           leavingPlanetEarth.inFile
                    = new BufferedReader(new InputStreamReader(System.in));

            leavingPlanetEarth.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            leavingPlanetEarth.logFile = new PrintWriter(filePath);
        }
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        return;

    }catch (Throwable e){
    
        System.out.println("Exception:" + e.toString()
                + "\nCause:" + e.getCause()
                + "\nMessage:" + e.getMessage());

        e.printStackTrace();;
    }
    finally{
        try{
            if(leavingPlanetEarth.inFile !=null)
                leavingPlanetEarth.inFile.close();
            
            if(leavingPlanetEarth.outFile !=null)
               leavingPlanetEarth.outFile.close();
            
            if(leavingPlanetEarth.logFile != null)
                leavingPlanetEarth.logFile.close();
        }catch(IOException ex){
            System.out.println("Error closing files");
            return;
        }      
        }

   public static void setCurrentGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Game getCurrentGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static PrintWriter getOutFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static PrintWriter getLogFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Player getPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    