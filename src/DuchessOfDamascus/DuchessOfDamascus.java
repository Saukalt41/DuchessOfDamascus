/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuchessOfDamascus;

import BYUI.cit260.DuchessOfDamascus.control.cryptControl;

import BYUI.cit260.DuchessOfDamascus.control.cryptControl.ghostRoll;
import BYUI.cit260.DuchessOfDamascus.model.Clues;
import BYUI.cit260.DuchessOfDamascus.model.Game;
import BYUI.cit260.DuchessOfDamascus.model.Location;
import BYUI.cit260.DuchessOfDamascus.model.Menu;
import BYUI.cit260.DuchessOfDamascus.model.Orb;
import BYUI.cit260.DuchessOfDamascus.model.Rooms;
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


        //Player    
        Player playerOne = new Player();

        playerOne.setName("Fred Flintstone");
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        Location location = new Location();  
        location.setLocation("The Crypt");
        
        cryptControl ghostRoll = new ghostRoll();
        


        //Clues
        Clues Clue = new Clues();

        Clue.setName("Look Up!");

        String cluesInfo = Clue.toString();
        System.out.println(cluesInfo);

        //Orb
        Orb orb = new Orb();

        orb.setPart(1);
        orb.setCompleted("Orb not completed");

        String orbInfo = orb.toString();
        System.out.println(orbInfo);

        //Game
        Game newGame = new Game();

        newGame.setTime("3:15 pm");
        newGame.setTimePlayed("1Hr 26Min 13Sec Played");

        String GameInfo = newGame.toString();
        System.out.println(GameInfo);

        //Menu
        Menu gameMenu = new Menu();

        gameMenu.setMenuType("Game Menu"
                + "[N]ew Game"
                + "[Q]uit Game"
                + "[H]elp");

        String MenuInfo = gameMenu.toString();
        System.out.println(MenuInfo);

        //Room
        Rooms someRoom = new Rooms();

        someRoom.setActive("Not Active");
        someRoom.setType("Orb Room Type");
        someRoom.setVisited("Visited");

        String roomsInfo = someRoom.toString();
        System.out.println(roomsInfo);

    }

    private static void ghostRoll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
