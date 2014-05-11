/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Stephen
 */
public class Map implements Serializable {
    
    private String showLocation;
    private String movement;

    public Map() {
    }
    
    

    public String getShowLocation() {
        return showLocation;
    }

    public void setShowLocation(String showLocation) {
        this.showLocation = showLocation;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    @Override
    public String toString() {
        return "Map{" + "showLocation=" + showLocation + ", movement=" + movement + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.showLocation);
        hash = 23 * hash + Objects.hashCode(this.movement);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.showLocation, other.showLocation)) {
            return false;
        }
        if (!Objects.equals(this.movement, other.movement)) {
            return false;
        }
        return true;
    }
    
    
    
}
