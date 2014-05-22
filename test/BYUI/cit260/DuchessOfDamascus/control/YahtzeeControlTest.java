/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Blanco
 */
public class YahtzeeControlTest {
    
    public YahtzeeControlTest() {
    }

    /**
     * Test of trackPoints method, of class YahtzeeControl.
     */
    @Test
    public void testTrackPoints() {
        
        /********************
         * Test Case 1
         *******************/
        System.out.println("Test Case trackPoints");
        
        //input values for test case 1
        double playerScore = 0.0;
        double npcScore = 0.0;
        double playerNewWinCount = playerScore +1;
        double npcNewWinCount = 0.0;
        
        YahtzeeControl instance = new YahtzeeControl();
        
        double expResult = 0;
        
        double result = instance.trackPoints(playerScore, npcScore, playerNewWinCount, npcNewWinCount);
       
        
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
