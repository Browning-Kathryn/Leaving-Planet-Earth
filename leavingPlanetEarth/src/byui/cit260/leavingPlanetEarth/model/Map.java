
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.model;
import leavingPlanetEarth.LeavingPlanetEarth;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;
/**
 *
 * @author Student
 */
public class Map implements Serializable{
      protected final BufferedReader keyboard = LeavingPlanetEarth.getinFile();
    protected final PrintWriter console = LeavingPlanetEarth.getOutFile();
private double rowCount;
private double columnCount;
private Location [][] locations;


    public Map() {
    }
    public Map(int rowCount, int columnCount){
        if(rowCount < 1 || columnCount < 1){
            this.console.println("The number of rows and columns must be greater than 0");
            return;
        }
        this.rowCount = 4;
        this.columnCount= 4;
        
        this.locations = new Location[rowCount][columnCount];
        
        for(int row =0; row < rowCount; row ++){
            for(int column = 0; column < columnCount; column ++){
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }



    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }
    
    public Location[][] getLocations() {
        return locations;
    }
    
public void setLocations(Location[][]locations){
    this.locations = locations;
}
    
  @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        return Double.doubleToLongBits(this.columnCount) == Double.doubleToLongBits(other.columnCount);
    }

  


}

