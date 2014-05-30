/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.cit260.DuchessOfDamascus.view;



import BYUI.cit260.DuchessOfDamascus.model.Player;
import java.util.Scanner;

/**
 *
 * @author Stephen & Bernardo
 */
public class StartProgramView {


    public void startProgram() {

        //Display the banner screen
        this.displayBanner();

        // prompt the player to enter their name. Retrieve the name of the player
        String playersName = this.getPlayersName();
        if (playersName == null) {
            return;
        }

        Player player = BYUI.cit260.DuchessOfDamascus.control.ProgramControl.createPlayer(playersName);

        this.displayWelcomeMessage(player);

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();

    }

    public String getPlayersName() {
        boolean valid = false; //This will tell us if the name has been acquired
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // This allows us to use the keyboard to input something in the game

        while (!valid) { // while a name has not yet been entered

            // Ask user for the player's name
            System.out.println("Hey Duchess! What's your name?");

            // Receive name from the keyboard and trim blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            if (playersName.toUpperCase().equals("Q")) { //Quitting ?
                return null;
            }
            // Name is invalid (non-blank or less than two characters)
            if (playersName.length() < 2) {
                //display error
                System.out.println("Invalid name - the name must be non blank"
                        + "and greater than one character in length");
            } else {
                valid = true; //Valid name entered
            }
        }
        return playersName; //return the name    
    }

    public void displayBanner() {
        System.out.println("\n\n***************************************************");

        System.out.println("*                                                 *"
                + "\n* This games is about the Duchess of Damscus and  *"
                + "\n* her journey through the Temple of the Sun.      *"
                + "\n* In this game you will face several trials meant *"
                + "\n* to test your skill and wit.                     *");

        System.out.println("*                                          *"
                + "\n* You will need to work your way through the      *"
                + "\n* temple solving various puzzles and collecting   *"
                + "\n* parts of the Solis Orb and number to the secret *"
                + "\n* code. There are three paths you may take. You   *"
                + "\n* can choose the order in which you venture down  *"
                + "\n* them, but you must complete the challenges in   *"
                + "\n* all the rooms in order to escape. After         *"
                + "\n* completing the orb you will have one final      *"
                + "\n* challenge.");

        System.out.println("*                                                 *"
                + "\n* Good luck, and may the Sun God look down on you *"
                + "\n* with mercy.                                     *");
    }

    

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n==============================");
        System.out.println("\tWelcome to the game" + player.getName());
        System.out.println("\tWe hope you enjoy the game!");
        System.out.println("==============================");

    }


}
