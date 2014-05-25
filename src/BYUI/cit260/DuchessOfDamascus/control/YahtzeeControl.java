/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.cit260.DuchessOfDamascus.control;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Blanco
 */
public class YahtzeeControl {

    public YahtzeeControl() {
    }

    private static int rollOne;
    private static int rollTwo;
    private int playerResult;
    private int ghostResult;
    int playerScore;
    int npcScore;
    int playerWinCount;
    int npcWinCount;
    Random number = new Random();

    @Override
    public String toString() {
        return "YahtzeeControl{" + "playerResult=" + playerResult + ", ghostResult=" + ghostResult + ", playerScore=" + playerScore + ", npcScore=" + npcScore + ", playerWinCount=" + playerWinCount + ", npcWinCount=" + npcWinCount + ", number=" + number + '}';
    }

    public static int getRollOne() {
        return rollOne;
    }

    public static void setRollOne(int rollOne) {
        YahtzeeControl.rollOne = rollOne;
    }

    public static int getRollTwo() {
        return rollTwo;
    }

    public static void setRollTwo(int rollTwo) {
        YahtzeeControl.rollTwo = rollTwo;
    }

    public int getPlayerResult() {
        return playerResult;
    }

    public void setPlayerResult(int playerResult) {
        this.playerResult = playerResult;
    }

    public int getGhostResult() {
        return ghostResult;
    }

    public void setGhostResult(int ghostResult) {
        this.ghostResult = ghostResult;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getNpcScore() {
        return npcScore;
    }

    public void setNpcScore(int npcScore) {
        this.npcScore = npcScore;
    }

    public int getPlayerWinCount() {
        return playerWinCount;
    }

    public void setPlayerWinCount(int playerWinCount) {
        this.playerWinCount = playerWinCount;
    }

    public int getNpcWinCount() {
        return npcWinCount;
    }

    public void setNpcWinCount(int npcWinCount) {
        this.npcWinCount = npcWinCount;
    }

    public Random getNumber() {
        return number;
    }

    public void setNumber(Random number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.playerResult;
        hash = 97 * hash + this.ghostResult;
        hash = 97 * hash + this.playerScore;
        hash = 97 * hash + this.npcScore;
        hash = 97 * hash + this.playerWinCount;
        hash = 97 * hash + this.npcWinCount;
        hash = 97 * hash + Objects.hashCode(this.number);
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
        final YahtzeeControl other = (YahtzeeControl) obj;
        if (this.playerResult != other.playerResult) {
            return false;
        }
        if (this.ghostResult != other.ghostResult) {
            return false;
        }
        if (this.playerScore != other.playerScore) {
            return false;
        }
        if (this.npcScore != other.npcScore) {
            return false;
        }
        if (this.playerWinCount != other.playerWinCount) {
            return false;
        }
        if (this.npcWinCount != other.npcWinCount) {
            return false;
        }
        return true;
    }

    

    public int rolls() {
        return number.nextInt(30) + 6;
    }
    
    public int playerResult() {
        playerResult = rolls();
        return playerResult;
    }
    public int ghostResult() {
        ghostResult = rolls();
        return ghostResult;
    }
    public String trackPoints() {
        String message;
        playerScore = playerResult;
        npcScore = ghostResult;

        if (playerScore > npcScore) {
            npcWinCount++;

        } else if (playerScore < npcScore) {
            playerWinCount++;
        }
        while (npcWinCount <= 2 || playerWinCount <= 2) {
            playerResult();
            ghostResult();
        }
        if (playerWinCount == 3) {
            message = "You Win!";
            
        }
        else if (npcWinCount == 3) {
            message = "you lose";
        }else{
            message = "try again";
        }
        return message;

    }

    double trackPoints(double playerScore, double npcScore, double playerNewWinCount, double npcNewWinCount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
