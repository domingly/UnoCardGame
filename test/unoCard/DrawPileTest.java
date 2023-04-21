/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unoCard;

import java.util.Stack;
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
public class DrawPileTest {
    
    public DrawPileTest() {
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
     * Test of drawCard method, of class DrawPile.
     */
    @Test
    public void testDrawCardGood() {
        System.out.println("testDrawCard good");
        Player p = new Player("Lyn");
       
        Dealer dealer =new Dealer();
        dealer.deckCard();

  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(dealer.shuffle().get(0).getCardValue(),dealer.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DrawPile draw=new DrawPile();
           
        draw.addDiscard(hand);
        p.addHandCard(draw.drawCards());
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.getPlayer(0).getHandCards().contains(draw.drawCards()));       
    }

    
 @Test
    public void testDrawCardBad() {
        System.out.println("testDrawCard bad");
        Player p = new Player("Lyn");
       
        Dealer dealer =new Dealer();
        dealer.deckCard();

  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(dealer.shuffle().get(0).getCardValue(),dealer.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DrawPile draw=new DrawPile();
           
        draw.addDiscard(hand);
        assertTrue(listOfPlayers.getPlayer(0).getHandCards().contains(draw.drawCards()));       
    }
    @Test
    public void testDrawCardBoundary() {
        System.out.println("testDrawCard boundary");
        Player p = new Player("Lyn");
       
        Dealer dealer =new Dealer();
        dealer.deckCard();

  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(dealer.shuffle().get(0).getCardValue(),dealer.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DrawPile draw=new DrawPile();
           
        draw.addDiscard(hand);
        p.addHandCard(draw.drawCards());
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.getPlayer(0).getHandCards().contains(draw.drawCards()));       
    }
    
}
