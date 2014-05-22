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
    private double playerResult;
    private double ghostResult;

    
    @Override
    public String toString() {
        return "YahtzeeControll{" + "playerRoll=" + playerRoll + ", ghostRoll=" + ghostRoll + '}';
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

        public playerRoll() {

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

    public double trackPoints(double playerScore, double npcScore, double playerNewWinCount, double npcNewWinCount) {
        double playerWinCount = 0;
        double npcWinCount = 0;

        playerScore = playerResult;
        npcScore = ghostResult;

        if (playerScore > npcScore) {
            npcWinCount++;
 
        }

       else if (playerScore < npcScore) {
             playerWinCount++;

        }

        if (playerWinCount == 3) {
            System.out.println("You Win!");

        }

        if (npcWinCount == 3) {
            System.out.println("You Lose!");

        }
        return 0;

    }
}
