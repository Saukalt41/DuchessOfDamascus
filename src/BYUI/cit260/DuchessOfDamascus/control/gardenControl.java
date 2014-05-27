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
    
    int goldCup = 0;
    int silverCup = 0;
    int bronzeCup = 0;
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
    
    public int recieveSilver() {
        String message;
        int total = silverCup + pour;
        if (silverCup == silverMax){
            message = "Cup is already full";
                               
        }
        else if (pour > silverMax){
            message = "the cup is running over";
            silverCup = silverMax;
                    
        }
        else if (total > silverMax){
            message = "the cup is running over";
            silverCup = silverMax;
        }
        else if (silverCup != silverMax) {
            silverCup = silverCup + pour;
        }
            return silverCup;
    }
    public int recieveGold() {
        String message;
        int total = goldCup + pour;
        if (goldCup == goldMax){
            message = "Congratulation you may move on";
                               
        }
        else if (pour > goldMax){
            message = "the cup is too full the trial will restart";
            goldCup = 0;
                    
        }
        else if (total > goldMax){
            message = "the cup is running over";
            silverCup = silverMax;
        }
        else if (goldCup != goldMax) {
            goldCup = goldCup + pour;
        }
            return goldCup;
    }
    public int recieveBronze() {
        String message;
        int total = bronzeCup + pour;
        if (bronzeCup == bronzeMax){
            message = "Cup is already full";                      
        }
        else if (pour > bronzeMax){
            message = "the cup is running over";
            bronzeCup = bronzeMax;
                    
        }
        else if (total > bronzeMax){
            message = "the cup is running over";
            bronzeCup = bronzeMax;
        }
        else if (bronzeCup != bronzeMax) {
            bronzeCup = bronzeCup + pour;
        }
            return bronzeCup;
    }
    
    
}
