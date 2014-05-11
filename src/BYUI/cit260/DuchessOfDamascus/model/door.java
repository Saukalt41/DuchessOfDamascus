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
public class door implements Serializable {
    
    private String open;
    private String closed;

    public door() {
    }
    
    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    @Override
    public String toString() {
        return "door{" + "open=" + open + ", closed=" + closed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.open);
        hash = 29 * hash + Objects.hashCode(this.closed);
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
        final door other = (door) obj;
        if (!Objects.equals(this.open, other.open)) {
            return false;
        }
        if (!Objects.equals(this.closed, other.closed)) {
            return false;
        }
        return true;
    }   
    
}
