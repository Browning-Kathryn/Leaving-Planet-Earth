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

    private static byui.cit260.leavingPlanetEarth.model.Game currentGame = null;
    private static Player player = null;
    private static jdk.internal.util.xml.impl.Input input = null;

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
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    
        return;

    }catch (Throwable e){
    
        System.out.println("Exception:" + e.toString()
                + "\nCause:" + e.getCause()
                + "\nMessage:" + e.getMessage());

        e.printStackTrace();;
    }
    finally {
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
    }
    public static void setCurrentGame(byui.cit260.leavingPlanetEarth.model.Game game) {
       leavingPlanetEarth.currentGame =  currentGame;
    }

    public static byui.cit260.leavingPlanetEarth.model.Game getCurrentGame() {
        return currentGame;
    }

    static void setPlayer(Player player) {
        leavingPlanetEarth.player = player;
    }
   
    public static void setInFile() {
        leavingPlanetEarth.inFile = inFile;
    }
    

    public static PrintWriter getOutFile() {
       return outFile;
    }
 public static void setOutFile(PrintWriter OutFile){
        leavingPlanetEarth.outFile = outFile;
 }
    public static PrintWriter getLogFile() {
        return logFile;
    }
    public static void setLogFile(PrintWriter logFile){
        leavingPlanetEarth.logFile = logFile;
    }

    public static Player getPlayer() {
      return player;
    }

    public static BufferedReader getinFile() {
       return inFile;
    }

}

       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    