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
 * @author Bernardo Blanco
 */
public class Orb implements Serializable{
    
    //Class Instance Variables
    private String completed;
    private double part;

    public Orb() {
    }

    
    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public double getPart() {
        return part;
    }

    public void setPart(double part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Orb{" + "completed=" + completed + ", part=" + part + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.completed);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.part) ^ (Double.doubleToLongBits(this.part) >>> 32));
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
        final Orb other = (Orb) obj;
        if (!Objects.equals(this.completed, other.completed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.part) != Double.doubleToLongBits(other.part)) {
            return false;
        }
        return true;
    }
      
    
    
}
