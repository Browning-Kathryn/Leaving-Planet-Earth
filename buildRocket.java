/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingplanetEarth.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Student
 */
public class buildRocket implements Serializable{
    private String description;
    private String color;
    private String partsNeeded;
    private double width;
    private double length;
    private double numberOfEngines;

    public buildRocket() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPartsNeeded() {
        return partsNeeded;
    }

    public void setPartsNeeded(String partsNeeded) {
        this.partsNeeded = partsNeeded;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(double numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.color);
        hash = 47 * hash + Objects.hashCode(this.partsNeeded);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.numberOfEngines) ^ (Double.doubleToLongBits(this.numberOfEngines) >>> 32));
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
        final buildRocket other = (buildRocket) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfEngines) != Double.doubleToLongBits(other.numberOfEngines)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return Objects.equals(this.partsNeeded, other.partsNeeded);
    }

    @Override
    public String toString() {
        return "buildRocket{" + "description=" + description + ", color=" + color + ", partsNeeded=" + partsNeeded + ", width=" + width + ", length=" + length + ", numberOfEngines=" + numberOfEngines + '}';
    }
    
    
}
