/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.control;

/**
 *
 * @author Stephen
 */
public class gardenControl {

    public gardenControl() {
    }
    
    int goldCup;
    int silverCup;
    int bronzeCup;
    int fountain;
    int goldMax = 50;
    int silverMax = 75;
    int bronzeMax = 100;
    int pour;

    @Override
    public String toString() {
        return "gardenControl{" + "goldCup=" + goldCup + ", silverCup=" + silverCup + ", bronzeCup=" + bronzeCup + ", fountain=" + fountain + ", goldMax=" + goldMax + ", silverMax=" + silverMax + ", bronzeMax=" + bronzeMax + '}';
    }

    public int getGoldCup() {
        return goldCup;
    }

    public void setGoldCup(int goldCup) {
        this.goldCup = goldCup;
    }

    public int getSilverCup() {
        return silverCup;
    }

    public void setSilverCup(int silverCup) {
        this.silverCup = silverCup;
    }

    public int getBronzeCup() {
        return bronzeCup;
    }

    public void setBronzeCup(int bronzeCup) {
        this.bronzeCup = bronzeCup;
    }

    public int getFountain() {
        return fountain;
    }

    public void setFountain(int fountain) {
        this.fountain = fountain;
    }

    public int getGoldMax() {
        return goldMax;
    }

    public void setGoldMax(int goldMax) {
        this.goldMax = goldMax;
    }

    public int getSilverMax() {
        return silverMax;
    }

    public void setSilverMax(int silverMax) {
        this.silverMax = silverMax;
    }

    public int getBronzeMax() {
        return bronzeMax;
    }

    public void setBronzeMax(int bronzeMax) {
        this.bronzeMax = bronzeMax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.goldCup;
        hash = 53 * hash + this.silverCup;
        hash = 53 * hash + this.bronzeCup;
        hash = 53 * hash + this.fountain;
        hash = 53 * hash + this.goldMax;
        hash = 53 * hash + this.silverMax;
        hash = 53 * hash + this.bronzeMax;
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
        final gardenControl other = (gardenControl) obj;
        if (this.goldCup != other.goldCup) {
            return false;
        }
        if (this.silverCup != other.silverCup) {
            return false;
        }
        if (this.bronzeCup != other.bronzeCup) {
            return false;
        }
        if (this.fountain != other.fountain) {
            return false;
        }
        if (this.goldMax != other.goldMax) {
            return false;
        }
        if (this.silverMax != other.silverMax) {
            return false;
        }
        if (this.bronzeMax != other.bronzeMax) {
            return false;
        }
        return true;
    }
    
     
    public int fillSilver() {
        silverCup = silverMax;
        return silverCup;
    }
    
    public int fillBronze() {
        bronzeCup = bronzeMax;
        return bronzeCup;
    }
    
    public int pourSilver() {
        pour = silverCup;
        return pour;
    }
    
    public int pourBronze() {
        pour = bronzeCup;
        return bronzeCup;
    }
    
    
    
    
    
}
