/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.view;

import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public abstract class View implements ViewInterface {
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value;
        
        do {
            
            System.out.println(this.promptMessage);
            value = this.getInput();
            this.doAction(value);
        }while (!value.equals("Q"));
        
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        while (!valid){
            
            System.out.println("\t\nEnter your selection below:");
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            
            break;
        }
        return selection;
    }
}
