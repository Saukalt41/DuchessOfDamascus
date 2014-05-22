/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.control;

/**
 *
 * @author Blanco
 */
public class YahtzeeControl {
    
    private static double rollOne; 
        private static double rollTwo;
        private String playerRoll;
        private String ghostRoll;

    public static double getRollOne() {
        return rollOne;
    }

    public static void setRollOne(double rollOne) {
        cryptControl.rollOne = rollOne;
    }

    public static double getRollTwo() {
        return rollTwo;
    }

    public static void setRollTwo(double rollTwo) {
        cryptControl.rollTwo = rollTwo;
    }
    private double playerResult;
    private double ghostResult;

    public String getPlayerRoll() {
        return playerRoll;
    }

    public void setPlayerRoll(String playerRoll) {
        this.playerRoll = playerRoll;
    }

    public String getGhostRoll() {
        return ghostRoll;
    }

    public void setGhostRoll(String ghostRoll) {
        this.ghostRoll = ghostRoll;
    }
        
        
        
        
    @Override
    public String toString() {
        return "cryptControl{" + "playerRoll=" + playerRoll + ", ghostRoll=" + ghostRoll + '}';
    }

    private static class rollOne {

        public rollOne() {
            rollOne = Math.random() * 36 + 6;
        }
    }
    private static class rollTwo {
        
        public rollTwo() {
            rollTwo = Math.random() * 36 + 6;
        }
    }

    private static class cryptControl {
        private static double rollOne;
        private static double rollTwo;

        public cryptControl() {
        }
    }
    
    public class playerRoll {
        
        public playerRoll(){
            
            double playerResult = rollOne;
            System.out.println("You rolled a " + playerResult + ".");
        }
    }
    
    public class ghostRoll {
        
        public ghostRoll() {
            
            double ghostResult = rollTwo;
            System.out.println("The ghost rolled a " + ghostResult + ".");
        }
    }
    
    
    
    
    public double trackPoints(double playerScore, double npcScore, double playerNewWinCount, double npcNewWinCount ){ 
       int playerWinCount = 0;
       int npcWinCount = 0;
       
       playerScore = playerResult;
       npcScore = ghostResult;
       
       
       if (playerScore > 50) {
               return -1;
       
}
       
       if (playerScore < 0) {
               return -1;
}   
       
       if (npcScore > 50) {
               return -1;
}
       
       if (npcScore < 0) {
               return -1;
}    
       
       if (playerScore > npcScore) {
          npcNewWinCount = npcWinCount++;
                
}
       
       if (playerScore < npcScore) {
          playerNewWinCount = playerWinCount++;
         
       }
          
       if (playerWinCount == 3) {
           System.out.println("You W!!!!");
           
       }
       
       if (npcWinCount == 3) {
           System.out.println("You Lose!");
           
       }
       return 0;

    
}
}
