/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trick
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNickName method, of class Player.
     */
    @Test
    public void testGetNickName() {
        System.out.println("getNickName");
        Player instance = null;
        String expResult = "";
        String result = instance.getNickName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Player.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card aCard = null;
        Player instance = null;
        instance.addCard(aCard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHandSum method, of class Player.
     */
    @Test
    public void testGetHandSum() {
        System.out.println("getHandSum");
        Player instance = null;
        int expResult = 0;
        int result = instance.getHandSum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerHand method, of class Player.
     */
    @Test
    public void testGetPlayerHand() {
        System.out.println("getPlayerHand");
        boolean hideCard = false;
        Player instance = null;
        instance.getPlayerHand(hideCard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
