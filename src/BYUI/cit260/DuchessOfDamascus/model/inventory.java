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
public class inventory implements Serializable {
    
    private String item;

    public inventory() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
    
    @Override
    public String toString() {
        return "inventory{" + "item=" + item + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.item);
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
        final inventory other = (inventory) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        return true;
    }
    
    
    
}
