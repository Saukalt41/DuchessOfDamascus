/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DuchessOfDamascus;

import byui.cit260.DuchessOfDamascus.model.Player;

/**
 *
 * @author Stephen Scott & Bernardo Blanco
 */
public class DuchessOfDamascus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}