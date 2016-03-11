package byui.cit260.leavingPlanetEarth.enums;

import java.io.Serializable;

public enum Actor implements Serializable {
    
    Kathryn("Astronaut and pilot."),
    Rachel("Astronaut and navigator.");
    
    private final String description;
    
    Actor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }   
    
}
