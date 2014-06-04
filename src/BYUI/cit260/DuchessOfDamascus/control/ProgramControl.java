/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.control;

import BYUI.cit260.DuchessOfDamascus.model.Game;
import BYUI.cit260.DuchessOfDamascus.model.Player;
import DuchessOfDamascus.DuchessOfDamascus;


/**
 *
 
    
* @author Stephen
 */
public class ProgramControl {
    static Player player;
    
    public static Player createPlayer(String playersName) {
        System.out.println("createPlayer function called");
        Player player = new Player();
        player.setName(playersName);
        
        DuchessOfDamascus.setPlayer(player);
        return player;

    }

    public static void saveGame(Game currentGame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
