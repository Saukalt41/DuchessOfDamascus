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
public class Menu implements Serializable{
    
    //Class Instance Variables
    private String menuType;

    public Menu() {
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    @Override
    public String toString() {
        return "Menu{" + "menuType=" + menuType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.menuType);
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
        final Menu other = (Menu) obj;
        if (!Objects.equals(this.menuType, other.menuType)) {
            return false;
        }
        return true;
    }
    
    
    
}
