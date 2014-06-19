/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.view;

import BYUI.cit260.DuchessOfDamascus.control.GameControl;
import BYUI.cit260.DuchessOfDamascus.control.ProgramControl;
import DuchessOfDamascus.DuchessOfDamascus;
import java.util.Scanner;

/**
 *
 * @author Bernardo Blanco
 */
public class MainMenuView extends View {
     
    public MainMenuView() {
     super("\n"
            + "\n--------------------------------------------"
            + "\n| Main Menu                                |"
            + "\n--------------------------------------------"
            + "\nG - Start game                             |"
            + "\nH - Get help on how to play the game       |"
            + "\nS - Save Game                              |"
            + "\nL - Load Game                              |"
            + "\nE - Exit                                   |"
            + "\n--------------------------------------------");
    }
    @Override
    public void doAction(char choice) {
        
        switch (choice){
            case 'G':
                this.startNewGame();
                break;
            case 'H':
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
                break;
            case 'S':
                ProgramControl.saveGame(DuchessOfDamascus.getCurrentGame());
                break;
            case 'L':
                ProgramControl.loadGame(DuchessOfDamascus.getCurrentGame());
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(DuchessOfDamascus.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    
}


