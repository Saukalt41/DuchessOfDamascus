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
 * @author Stephen
 */
public class YahtzeeControlTest {
    
    public YahtzeeControlTest() {
    }

    /**
     * Test of toString method, of class YahtzeeControl.
     */
    
  

    /**
     * Test of trackPoints method, of class YahtzeeControl.
     */
    @Test
    public void testTrackPoints() {
        System.out.println("trackPoints");
        double playerScore = 22.0;
        double npcScore = 36.0;
        double playerNewWinCount = 0.0;
        double npcNewWinCount = 1.0;
        YahtzeeControl instance = new YahtzeeControl();
        double expResult = 0.0;
        double result = instance.trackPoints(playerScore, npcScore, playerNewWinCount, npcNewWinCount);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
