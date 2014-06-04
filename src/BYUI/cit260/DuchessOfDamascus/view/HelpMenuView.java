/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.view;

import BYUI.cit260.DuchessOfDamascus.control.ProgramControl;
import DuchessOfDamascus.DuchessOfDamascus;
import java.util.Scanner;
import BYUI.cit260.DuchessOfDamascus.view.MainMenuView;
/**
 *
 * @author Stephen
 */
class HelpMenuView {
    
    static private final String helpText = "\n|****************************************************|"
            + "\n|                                                    |"
            + "\n| From the menu choose Start game to begin a new     |"
            + "\n| adventure. You can also save a current game or you |"
            + "\n| can exit the game. In each room of the temple you  |"
            + "\n| can select the help menu to show you a room        |"
            + "\n| specific instructions or guidance.                 |"
            + "\n|                                                    |"
            + "\n| B - Return to Main Menu                            |"
            + "\n|                                                    |"
            + "\n|____________________________________________________|";

    void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(helpText);
            
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
            if (menuChoice == "B" ) {
                //display error
                System.out.println(menuChoice + " is not a valid choice."
                        + "\nPlease choose B to return to the main menu");
            } else {
                 valid = true;//Valid name entered
            }
            
        }
        return menuChoice; //return the name    
    }
    public void doAction(char choice) {
        
        switch (choice){
            case 'B':
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.displayMenu();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
        
    }
    

