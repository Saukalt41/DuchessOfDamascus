/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.view;

import BYUI.cit260.DuchessOfDamascus.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stephen
 */
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
    }

    /**
     * Test of startProgram method, of class StartProgramView.
     */
    @Test
    public void testStartProgram() {
        System.out.println("startProgram");
        StartProgramView instance = new StartProgramView();
        instance.startProgram();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getPlayersName method, of class StartProgramView.
     */
    @Test
    public void testGetPlayersName() {
        System.out.println("getPlayersName");
        StartProgramView instance = new StartProgramView();
        String expResult = "";
        String result = instance.getPlayersName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of displayBanner method, of class StartProgramView.
     */
    @Test
    public void testDisplayBanner() {
        System.out.println("displayBanner");
        StartProgramView instance = new StartProgramView();
        instance.displayBanner();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of displayWelcomeMessage method, of class StartProgramView.
     */
    @Test
    public void testDisplayWelcomeMessage() {
        System.out.println("displayWelcomeMessage");
        Player player = null;
        StartProgramView instance = new StartProgramView();
        instance.displayWelcomeMessage(player);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
