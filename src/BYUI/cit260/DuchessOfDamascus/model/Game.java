/*
 * Duchess Of Damascus
 * The best project ever
 * CIT 260 Brother Jackson
 */

package BYUI.cit260.DuchessOfDamascus.model;


import BYUI.cit260.DuchessOfDamascus.control.GameControl;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Blanco
 */
public class Game implements Serializable{
   
    //Class Intance Variables
    private double time;
    private String timePlayed;
//    private InventoryItem[] inventory;
    private Player player;
    private Wagon wagon;
    private Map map;

//    public InventoryItem[] getInventory() {
//        return inventory;
//    }
//
//    public void setInventory(InventoryItem[] inventory) {
//        this.inventory = inventory;
//    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    

    public Game() {
    }
    
    public double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(String timePlayed) {
        this.timePlayed = timePlayed;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + ", timePlayed=" + timePlayed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.time);
        hash = 59 * hash + Objects.hashCode(this.timePlayed);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (!Objects.equals(this.timePlayed, other.timePlayed)) {
            return false;
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //This will create a new player
    }

//    public void setInventory(BYUI.cit260.DuchessOfDamascus.control.InventoryItem[] Inventory) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void createInventoryList() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void createInventoryList(GameControl.InventoryItem[] inventoryList) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
    
    
}
