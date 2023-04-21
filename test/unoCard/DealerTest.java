/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unoCard;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lyn
 */
public class DealerTest {
    
    public DealerTest() {
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
    @Test
    public void testShuffleCardGood() {
        System.out.println("testShuffleCard Good");
        Dealer dealer =new Dealer();  
        assertTrue(!dealer.shuffleCard().getCards().isEmpty());       
    }
    @Test
    public void testShuffleCardBad() {
        System.out.println("testShuffleCard Bad");
        Dealer dealer =new Dealer();  
        assertFalse(dealer.shuffleCard().getCards().isEmpty());       
    }
    @Test
    public void testShuffleCardBoundary() {
        System.out.println("testShuffleCard boundary");
        Dealer dealer =new Dealer();  
        assertTrue(!dealer.shuffleCard().getCards().isEmpty());       
    }
    
}
