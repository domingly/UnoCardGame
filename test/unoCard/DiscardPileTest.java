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
public class DiscardPileTest {
    
    public DiscardPileTest() {
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
     * Test of addDiscard method, of class DiscardPile.
     */
    @Test
    public void testAddDiscardGood() {
        System.out.println("testAddDiscard good");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);
        assertTrue(discard.getCards().contains(hand));
    }
    @Test
    public void testAddDiscardBad() {
        System.out.println("testAddDiscard bad");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);
        assertFalse(!discard.getCards().contains(hand));
    }
    @Test
    public void testAddDiscardBoundary() {
        System.out.println("testAddDiscard boundary");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);
        assertTrue(discard.getCards().contains(hand));
    } 

    
}
