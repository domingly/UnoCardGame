/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unoCard;

import java.util.ArrayList;
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
     * Test of addHandCard method, of class Player.
     */
    @Test
    public void testAddHandCardGood() {
        System.out.println("addHandCard good");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.getPlayer(0).getHandCards().contains(hand));
    }
    @Test
    public void testAddHandCardBad() {
        System.out.println("addHandCard bad");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=null;
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.getPlayer(0).getHandCards().contains(hand));
    }
    @Test
    public void testAddHandCardBoundary() {
        System.out.println("addHandCard boundary");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.getPlayer(0).getHandCards().contains(hand));
    }




    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetNameGood() {
        System.out.println("setName good");
        String name = "lyn";
        Player instance = new Player();
        instance.setName(name);
        assertTrue(instance.getName().length()>0);
    }
    @Test
    public void testSetNameBad() {
        System.out.println("setName bad");
        String name = "";
        Player instance = new Player();
        instance.setName(name);
        assertFalse(instance.getName().length()>0);
    }
    @Test
    public void testSetNameBoundary() {
        System.out.println("setName boundary");
        String name = "lyn";
        Player instance = new Player();
        instance.setName(name);
        assertTrue(instance.getName().length()>0);
    }




    @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinner good");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        boolean expResult = true;
        boolean result = p.declareWinner(p);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testDeclareWinnerBad() {
        System.out.println("declareWinner bad");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        GroupOfCards hand1=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        p.addHandCard(hand1); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        boolean expResult = false;
        boolean result = p.declareWinner(p);
        assertEquals(expResult, result);

    }

    @Test
    public void testDeclareWinnerBoundary() {
        System.out.println("declareWinner boundary");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        boolean expResult = true;
        boolean result = p.declareWinner(p);
        assertEquals(expResult, result);

    }
}
