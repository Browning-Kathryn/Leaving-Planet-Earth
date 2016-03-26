/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.view;
import leavingPlanetEarth.LeavingPlanetEarth;
import java.io.PrintWriter;

/**
 *
 * @author OptimusPrime
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = LeavingPlanetEarth.getOutFile();
    private static final PrintWriter logFile = LeavingPlanetEarth.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println(
                            "-----------------------------------------------"
                           +"\n- ERROR - " + errorMessage
                           + "\n--------------------------------------------");
        
        logFile.println(className + "-" + errorMessage);
       
    }
    
}
