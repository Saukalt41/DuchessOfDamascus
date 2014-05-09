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
public class Clues implements Serializable{
    

    //Class Instance Variables
    private String hint;

    
    public Clues() {
    }
    
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public String toString() {
        return "Clues{" + "hint=" + hint + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.hint);
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
        final Clues other = (Clues) obj;
        return Objects.equals(this.hint, other.hint);
    }

     public void setName(String look_Up) {
        System.out.println("Look Up!");
    }

    
    }
    
