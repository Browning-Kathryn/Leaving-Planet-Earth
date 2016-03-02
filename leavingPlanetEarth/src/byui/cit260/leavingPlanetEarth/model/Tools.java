/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.model;

import java.io.Serializable;
/**
 *
 * @author OptimusPrime
 */
public class Tools implements Serializable {
    // class instance variables
    private double attachingPower;
    private double cuttingPower;
    private double carryingPower;
    private double diggingPower;

    public Tools() {
    }
    
    

    public double getAttachingPower() {
        return attachingPower;
    }

    public void setAttachingPower(double attachingPower) {
        this.attachingPower = attachingPower;
    }

    public double getCuttingPower() {
        return cuttingPower;
    }

    public void setCuttingPower(double cuttingPower) {
        this.cuttingPower = cuttingPower;
    }

    public double getCarryingPower() {
        return carryingPower;
    }

    public void setCarryingPower(double carryingPower) {
        this.carryingPower = carryingPower;
    }

    public double getDiggingPower() {
        return diggingPower;
    }

    public void setDiggingPower(double diggingPower) {
        this.diggingPower = diggingPower;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.attachingPower) ^ (Double.doubleToLongBits(this.attachingPower) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.cuttingPower) ^ (Double.doubleToLongBits(this.cuttingPower) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.carryingPower) ^ (Double.doubleToLongBits(this.carryingPower) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.diggingPower) ^ (Double.doubleToLongBits(this.diggingPower) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tools other = (Tools) obj;
        if (Double.doubleToLongBits(this.attachingPower) != Double.doubleToLongBits(other.attachingPower)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cuttingPower) != Double.doubleToLongBits(other.cuttingPower)) {
            return false;
        }
        if (Double.doubleToLongBits(this.carryingPower) != Double.doubleToLongBits(other.carryingPower)) {
            return false;
        }
        if (Double.doubleToLongBits(this.diggingPower) != Double.doubleToLongBits(other.diggingPower)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tools{" + "attachingPower=" + attachingPower + ", cuttingPower=" + cuttingPower + ", carryingPower=" + carryingPower + ", diggingPower=" + diggingPower + '}';
    }
    
}