/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.cit260.DuchessOfDamascus.control;

import java.util.Random;
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

   

    /**
     * Test of rolls method, of class YahtzeeControl.
     */
    @Test
    public void testRolls() {
        System.out.println("rolls");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.rolls();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       ;
    }

    /**
     * Test of toString method, of class YahtzeeControl.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        YahtzeeControl instance = new YahtzeeControl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRollOne method, of class YahtzeeControl.
     */
    @Test
    public void testGetRollOne() {
        System.out.println("getRollOne");
        int expResult = 0;
        int result = YahtzeeControl.getRollOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRollOne method, of class YahtzeeControl.
     */
    @Test
    public void testSetRollOne() {
        System.out.println("setRollOne");
        int rollOne = 0;
        YahtzeeControl.setRollOne(rollOne);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRollTwo method, of class YahtzeeControl.
     */
    @Test
    public void testGetRollTwo() {
        System.out.println("getRollTwo");
        int expResult = 0;
        int result = YahtzeeControl.getRollTwo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRollTwo method, of class YahtzeeControl.
     */
    @Test
    public void testSetRollTwo() {
        System.out.println("setRollTwo");
        int rollTwo = 0;
        YahtzeeControl.setRollTwo(rollTwo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerResult method, of class YahtzeeControl.
     */
    @Test
    public void testGetPlayerResult() {
        System.out.println("getPlayerResult");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.getPlayerResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerResult method, of class YahtzeeControl.
     */
    @Test
    public void testSetPlayerResult() {
        System.out.println("setPlayerResult");
        int playerResult = 0;
        YahtzeeControl instance = new YahtzeeControl();
        instance.setPlayerResult(playerResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGhostResult method, of class YahtzeeControl.
     */
    @Test
    public void testGetGhostResult() {
        System.out.println("getGhostResult");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.getGhostResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGhostResult method, of class YahtzeeControl.
     */
    @Test
    public void testSetGhostResult() {
        System.out.println("setGhostResult");
        int ghostResult = 0;
        YahtzeeControl instance = new YahtzeeControl();
        instance.setGhostResult(ghostResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerScore method, of class YahtzeeControl.
     */
    @Test
    public void testGetPlayerScore() {
        System.out.println("getPlayerScore");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.getPlayerScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerScore method, of class YahtzeeControl.
     */
    @Test
    public void testSetPlayerScore() {
        System.out.println("setPlayerScore");
        int playerScore = 0;
        YahtzeeControl instance = new YahtzeeControl();
        instance.setPlayerScore(playerScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNpcScore method, of class YahtzeeControl.
     */
    @Test
    public void testGetNpcScore() {
        System.out.println("getNpcScore");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.getNpcScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNpcScore method, of class YahtzeeControl.
     */
    @Test
    public void testSetNpcScore() {
        System.out.println("setNpcScore");
        int npcScore = 0;
        YahtzeeControl instance = new YahtzeeControl();
        instance.setNpcScore(npcScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerWinCount method, of class YahtzeeControl.
     */
    @Test
    public void testGetPlayerWinCount() {
        System.out.println("getPlayerWinCount");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.getPlayerWinCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerWinCount method, of class YahtzeeControl.
     */
    @Test
    public void testSetPlayerWinCount() {
        System.out.println("setPlayerWinCount");
        int playerWinCount = 0;
        YahtzeeControl instance = new YahtzeeControl();
        instance.setPlayerWinCount(playerWinCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNpcWinCount method, of class YahtzeeControl.
     */
    @Test
    public void testGetNpcWinCount() {
        System.out.println("getNpcWinCount");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.getNpcWinCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNpcWinCount method, of class YahtzeeControl.
     */
    @Test
    public void testSetNpcWinCount() {
        System.out.println("setNpcWinCount");
        int npcWinCount = 0;
        YahtzeeControl instance = new YahtzeeControl();
        instance.setNpcWinCount(npcWinCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class YahtzeeControl.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        YahtzeeControl instance = new YahtzeeControl();
        Random expResult = null;
        Random result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class YahtzeeControl.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        Random number = null;
        YahtzeeControl instance = new YahtzeeControl();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class YahtzeeControl.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class YahtzeeControl.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        YahtzeeControl instance = new YahtzeeControl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerResult method, of class YahtzeeControl.
     */
    @Test
    public void testPlayerResult() {
        System.out.println("playerResult");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.playerResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ghostResult method, of class YahtzeeControl.
     */
    @Test
    public void testGhostResult() {
        System.out.println("ghostResult");
        YahtzeeControl instance = new YahtzeeControl();
        int expResult = 0;
        int result = instance.ghostResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trackPoints method, of class YahtzeeControl.
     */
    @Test
    public void testTrackPoints_0args() {
        System.out.println("trackPoints");
        YahtzeeControl instance = new YahtzeeControl();
        String expResult = "";
        String result = instance.trackPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trackPoints method, of class YahtzeeControl.
     */
    @Test
    public void testTrackPoints_4args() {
        System.out.println("trackPoints");
        double playerScore = 0.0;
        double npcScore = 0.0;
        double playerNewWinCount = 0.0;
        double npcNewWinCount = 0.0;
        YahtzeeControl instance = new YahtzeeControl();
        double expResult = 0.0;
        double result = instance.trackPoints(playerScore, npcScore, playerNewWinCount, npcNewWinCount);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
