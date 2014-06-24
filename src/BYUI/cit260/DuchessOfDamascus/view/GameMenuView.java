/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.view;

import BYUI.cit260.DuchessOfDamascus.control.ProgramControl;
import DuchessOfDamascus.DuchessOfDamascus;
import java.util.Scanner;

/**
 *
 * @author Bernardo Blanco
 */
class GameMenuView extends View{
    public GameMenuView(){
    super ("\n"
            + "\n-------------------------------"
            + "\n| Game Menu                   |"
            + "\n-------------------------------"
            + "\nS - Save Game                 |"
            + "\nI - Inventory                 |"
            + "\nM - Map                       |"
            + "\nH - Help                      |"
            + "\nE - Exit                      |"
            + "\n-------------------------------");
    }
    
    @Override
    public void doAction(String choice) {
        
        switch (choice.trim().toUpperCase().charAt(0)){
            case 'S':
                ProgramControl.saveGame(DuchessOfDamascus.getCurrentGame());
                break;
            case 'I':
                System.out.println("\n*** This will call out our InventoryView");
                break;
            case 'M':
                System.out.println("\n*** This will call out our MapView");
                break;
            case 'H':
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }    
    
}
