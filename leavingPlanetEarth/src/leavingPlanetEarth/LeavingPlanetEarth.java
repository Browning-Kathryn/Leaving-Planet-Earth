/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leavingPlanetEarth;

import byui.cit260.leavingPlanetEarth.model.Player;
import byui.cit260.leavingPlanetEarth.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author OptimusPrime
 */
public class LeavingPlanetEarth {
    

    private static byui.cit260.leavingPlanetEarth.model.Game currentGame = null;
    private static Player player = null;
    private static jdk.internal.util.xml.impl.Input input = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static void main(String[] args){
     try {

           LeavingPlanetEarth.inFile
                    = new BufferedReader(new InputStreamReader(System.in));

            LeavingPlanetEarth.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            LeavingPlanetEarth.logFile = new PrintWriter(filePath);
        
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
            if(LeavingPlanetEarth.inFile !=null)
                LeavingPlanetEarth.inFile.close();
            
            if(LeavingPlanetEarth.outFile !=null)
               LeavingPlanetEarth.outFile.close();
            
            if(LeavingPlanetEarth.logFile != null)
                LeavingPlanetEarth.logFile.close();
        }catch(IOException ex){
            System.out.println("Error closing files");
            return;
        }      
        
     }
    }
    public static void setCurrentGame(byui.cit260.leavingPlanetEarth.model.Game game) {
       LeavingPlanetEarth.currentGame =  currentGame;
    }

    public static byui.cit260.leavingPlanetEarth.model.Game getCurrentGame() {
        return currentGame;
    }

    public static void setPlayer(Player player) {
        LeavingPlanetEarth.player = player;
    }
   
    public static void setInFile() {
        LeavingPlanetEarth.inFile = inFile;
    }
    

    public static PrintWriter getOutFile() {
       return outFile;
    }
 public static void setOutFile(PrintWriter OutFile){
        LeavingPlanetEarth.outFile = outFile;
 }
    public static PrintWriter getLogFile() {
        return logFile;
    }
    public static void setLogFile(PrintWriter logFile){
        LeavingPlanetEarth.logFile = logFile;
    }

    public static Player getPlayer() {
      return player;
    }

    public static BufferedReader getinFile() {
       return inFile;
    }

}

       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
