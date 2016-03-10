/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.leavingPlanetEarth.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author OptimusPrime
 */
public class InventoryItem implements Serializable {
    
    // class instance variables
    private String description;
    private double quantityInStock;
    private double requireAmount;

    public InventoryItem() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String inventoryType) {
        this.description = inventoryType;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getRequireAmount() {
        return requireAmount;
    }

    public void setRequireAmount(double requireAmount) {
        this.requireAmount = requireAmount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.requireAmount) ^ (Double.doubleToLongBits(this.requireAmount) >>> 32));
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
        final InventoryItem other = (InventoryItem) obj;
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requireAmount) != Double.doubleToLongBits(other.requireAmount)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + description + ", quantityInStock=" + quantityInStock + ", requireAmount=" + requireAmount + '}';
    }
    
    
}
