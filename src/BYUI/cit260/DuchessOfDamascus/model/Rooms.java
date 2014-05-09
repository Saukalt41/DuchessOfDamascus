/*
 * Duchess Of Damascus
 * The best project ever
 * CIT 260 Brother Jackson
 */

package BYUI.cit260.DuchessOfDamascus.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Blanco
 */
public class Rooms implements Serializable{
    
    //Instance Class Variables
    private String active;
    private String visited;
    private String Type;

    
    public Rooms() {
    }
    
    
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "Room{" + "active=" + active + ", visited=" + visited + ", Type=" + Type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.active);
        hash = 79 * hash + Objects.hashCode(this.visited);
        hash = 79 * hash + Objects.hashCode(this.Type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rooms other = (Rooms) obj;
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        return Objects.equals(this.Type, other.Type);
    }
    
    
    
    
    
}
