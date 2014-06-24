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
class HelpMenuView extends View {
    
    public HelpMenuView(){
    super("\n|****************************************************|"
            + "\n|                                                    |"
            + "\n| From the menu choose Start game to begin a new     |"
            + "\n| adventure. You can also save a current game or you |"
            + "\n| can exit the game. In each room of the temple you  |"
            + "\n| can select the help menu to show you a room        |"
            + "\n| specific instructions or guidance.                 |"
            + "\n|                                                    |"
            + "\n| B - Return to Main Menu                            |"
            + "\n|                                                    |"
            + "\n|____________________________________________________|");

    }
    
    @Override
    public void doAction(String choice) {
        
        switch (choice.trim().toUpperCase().charAt(0)){
            case 'B':
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    
        
    }
    

