package byui.cit260.leavingPlanetEarth.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author OptimusPrime
 */
public enum Parts implements Serializable {
    Engine("Connect to lower half of rocket for a power source"),
    Window("Insert into the rocket for essential Needs"),
    Gastank("Insert into rocket for power source"),
    Chair("Insert chair for group members to sit on."),
    Fins("Insert on outside of rocket for life power"),
    Shelves("Insert inside rocket to store food for essential needs."),
    Metalpanel("COver rocket for lift power.");
    
    private final String value;
    
    // class instance variables
    private String powerSource;
    private double liftPower;
    private String essentialNeeds;

    private Parts( String value) {
        this.value = value;
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

}
