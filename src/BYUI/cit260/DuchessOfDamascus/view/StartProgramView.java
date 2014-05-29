/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.view;

/**
 *
 * @author Stephen
 */
public class StartProgramView {
    
   public void startProgram(){
       
       //Display the banner screen
       this.displayBanner();
                
   }
public void displayBanner(){
    System.out.println("\n\n********************************************");
    
    System.out.println("*                                          *"
            + "\n* This games is about the Duchess of Damscus and  *"
            + "\n* her journey through the Temple of the Sun.      *"
            + "\n* In this game you will face several trials meant *"
            + "\n* to test your skill and wit. Good luck adventuror*");
}    
    
}
