/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanrtEarth.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author OptimusPrime
 */
public class Parts implements Serializable {
    // class instance variables
    private String powerSource;
    private double liftPower;

    public Parts() {
    }

    
    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public double getLiftPower() {
        return liftPower;
    }

    public void setLiftPower(double liftPower) {
        this.liftPower = liftPower;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.powerSource);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.liftPower) ^ (Double.doubleToLongBits(this.liftPower) >>> 32));
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
        final Parts other = (Parts) obj;
        if (Double.doubleToLongBits(this.liftPower) != Double.doubleToLongBits(other.liftPower)) {
            return false;
        }
        if (!Objects.equals(this.powerSource, other.powerSource)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parts{" + "powerSource=" + powerSource + ", liftPower=" + liftPower + '}';
    }

}