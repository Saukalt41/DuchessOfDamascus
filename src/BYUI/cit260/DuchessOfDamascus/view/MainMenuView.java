/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.view;

import java.util.Scanner;

/**
 *
 * @author Bernardo Blanco
 */
public class MainMenuView {
    
    private static final String Menu = "\n"
            + "\n--------------------------------------------"
            + "\n| Main Menu                                |"
            + "\n--------------------------------------------"
            + "\nG - Start game                             |"
            + "\nH - Get help on how to play the game       |"
            + "\nS - Save Game                              |"
            + "\nE - Exit                                   |"
            + "\n--------------------------------------------";
    
    public void displayMenu(){
        //Not yet finished
        char selection = ' ';
        do {
            
            System.out.println(Menu);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        } while (selection != 'E');
        }
    
    public String getInput() {
        boolean valid = false; //This will tell us if the name has been acquired
        String menuChoice = null;
        Scanner keyboard = new Scanner(System.in); // This allows us to use the keyboard to input something in the game

        while (!valid) { // while a name has not yet been entered

            // Ask user for the player's name
            System.out.println("Choose a menu option:");

            // Receive name from the keyboard and trim blanks
            menuChoice = keyboard.nextLine();
            menuChoice = menuChoice.trim();
            menuChoice = menuChoice.toUpperCase();

            if (menuChoice.toUpperCase().equals("E")) { //Quitting ?
                return null;
            }
            // Name is invalid (non-blank or less than two characters)
            if (menuChoice == "G" || menuChoice == "H" || menuChoice == "S" || menuChoice == "E") {
                //display error
                System.out.println(menuChoice + " is not a valid choice."
                        + "\nPlease choose G, H, S, or E.");
            } else {
                valid = true; //Valid name entered
            }
            
        }
        return menuChoice; //return the name    
    }
    public void doAction(char choice) {
        
        switch (choice){
            case 'G':
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.displayMenu();
        }
    }
    
}


