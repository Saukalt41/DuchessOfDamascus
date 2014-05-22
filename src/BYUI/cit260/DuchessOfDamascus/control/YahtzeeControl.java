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
    
    public double trackPoints(double playerScore, double npcScore, double playerNewWinCount, double npcNewWinCount ){ 
       int playerWinCount = 0;
       int npcWinCount = 0;
       
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
          

       return 0;

    
}
}
