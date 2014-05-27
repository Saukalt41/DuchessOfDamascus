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
public class gardenControlTest {
    
    public gardenControlTest() {
    }

    /**
     * Test of toString method, of class gardenControl.
     */
    
    @Test
    public void testFillSilver() {
        System.out.println("fillSilver");
        gardenControl instance = new gardenControl();
        int expResult = 75;
        int result = instance.fillSilver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of fillBronze method, of class gardenControl.
     */
    @Test
    public void testFillBronze() {
        System.out.println("fillBronze");
        gardenControl instance = new gardenControl();
        int expResult = 100;
        int result = instance.fillBronze();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of pourSilver method, of class gardenControl.
     */
    @Test
    public void testPourSilver() {
        System.out.println("pourSilver");
        gardenControl instance = new gardenControl();
        int expResult = 0;
        int result = instance.pourSilver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of pourBronze method, of class gardenControl.
     */
    @Test
    public void testPourBronze() {
        System.out.println("pourBronze");
        gardenControl instance = new gardenControl();
        int expResult = 0;
        int result = instance.pourBronze();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of recieveSilver method, of class gardenControl.
     */
    @Test
    public void testRecieveSilver() {
        System.out.println("recieveSilver");
        gardenControl instance = new gardenControl();
        int expResult = 0;
        int result = instance.recieveSilver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of recieveGold method, of class gardenControl.
     */
    @Test
    public void testRecieveGold() {
        System.out.println("recieveGold");
        gardenControl instance = new gardenControl();
        int expResult = 0;
        int result = instance.recieveGold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of recieveBronze method, of class gardenControl.
     */
    @Test
    public void testRecieveBronze() {
        System.out.println("recieveBronze");
        gardenControl instance = new gardenControl();
        int expResult = 0;
        int result = instance.recieveBronze();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
