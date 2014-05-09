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
public class Game implements Serializable{
   
    //Class Intance Variables
    private String time;
    private String timePlayed;

    public Game() {
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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
        return true;
    }
    
    
    
}
