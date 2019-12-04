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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of shuffleDeck method, of class GroupOfCards.
     */
    @Test
    public void testShuffleDeck() {
        System.out.println("shuffleDeck");
        GroupOfCards instance = new GroupOfCards();
        instance.shuffleDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardGroup method, of class GroupOfCards.
     */
    @Test
    public void testGetCardGroup() {
        System.out.println("getCardGroup");
        GroupOfCards instance = new GroupOfCards();
        instance.getCardGroup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealNextCard method, of class GroupOfCards.
     */
    @Test
    public void testDealNextCard() {
        System.out.println("dealNextCard");
        GroupOfCards instance = new GroupOfCards();
        Card expResult = null;
        Card result = instance.dealNextCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
