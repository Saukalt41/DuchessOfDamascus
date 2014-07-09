/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuchessOfDamascus;

import BYUI.cit260.DuchessOfDamascus.control.YahtzeeControl;
import BYUI.cit260.DuchessOfDamascus.model.Clues;
import BYUI.cit260.DuchessOfDamascus.model.Game;
import BYUI.cit260.DuchessOfDamascus.model.Location;
import BYUI.cit260.DuchessOfDamascus.model.Menu;
import BYUI.cit260.DuchessOfDamascus.model.Orb;
import BYUI.cit260.DuchessOfDamascus.model.Rooms;
import BYUI.cit260.DuchessOfDamascus.model.Player;
import BYUI.cit260.DuchessOfDamascus.view.StartProgramView;

/**
 *
 * @author Stephen Scott & Bernardo Blanco
 */
public class DuchessOfDamascus {
    
    private static Player player = null;
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DuchessOfDamascus.currentGame = currentGame;
    }
   

    public DuchessOfDamascus() {
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DuchessOfDamascus.player = player;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      try{
          java.awt.EventQueue.invokeLater(
          new Runnable(){
              @Override
              public void run(){
                  StartProgramFrame startProgramFrame = new StartProgramFrame();
                  startProgramFrame.setVisible(true);
              }
          }
          );
          
        return;  
      } 
      //  new StartProgramView().startProgram();
    }

    

    

   

    
    

}
