/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.leavingPlanetEarth.control;

/**
 *
 * @author Student
 */
public class distanceTravelledControl {
    public double calcDistanceTravel(double distance, double pace){
    
   if (distance < 0){
   return -1;
   
   }
   
   if (pace < 0 || pace > 10){
       return -1;
   }
   
   double time= (distance/pace);
           return time;
    
    
    
    }
}
