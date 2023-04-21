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
public class CardRulesTest {
    
    public CardRulesTest() {
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
     * Test of checkCard method, of class CardRules.
     */
    @Test
    public void testCheckCardGood() {
        System.out.println("checkCard good");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();
        boolean expResult = true;
        boolean result = instance.checkCard(top, selected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckCardBad() {
        System.out.println("checkCard bad");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top =new GroupOfCards(GroupOfCards.CardType.WILD_DRAW_FOUR.toString(),GroupOfCards.CardColor.BLACK);
        GroupOfCards selected = discard.getTopCard() ;
        CardRules instance = new CardRules();
        boolean expResult = false;
        boolean result = instance.checkCard(top, selected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testCheckCardBoundary() {
        System.out.println("checkCard boundary");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(deck.shuffle().get(0).getCardValue(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();
        boolean expResult = true;
        boolean result = instance.checkCard(top, selected);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSkipCardGood() {
        System.out.println("skip card good");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.SKIP.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.SKIP.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
      public void testSkipCardBad() {
        System.out.println("skip card bad");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.NUMBER.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertFalse(hand.getCardValue().equals(GroupOfCards.CardType.SKIP.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
      public void testSkipCardBoundary() {
        System.out.println("skip card boundary");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.SKIP.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.SKIP.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testReverseCardGood() {
        System.out.println("reverse card good");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.REVERSE.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.REVERSE.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
      public void testReverseCardBad() {
        System.out.println("reverse card bad");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.NUMBER.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertFalse(hand.getCardValue().equals(GroupOfCards.CardType.REVERSE.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
      public void testReverseCardBoundary() {
        System.out.println("reverse card boundary");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.REVERSE.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.REVERSE.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testDrawTwoCardGood() {
        System.out.println("draw two card good");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.DRAW_TWO.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.DRAW_TWO.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
      public void testDrawTwoCardBad() {
        System.out.println("draw two card bad");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.NUMBER.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertFalse(hand.getCardValue().equals(GroupOfCards.CardType.REVERSE.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
      public void testDrawTwoCardBoundary() {
        System.out.println("draw two card boundary");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.DRAW_TWO.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.DRAW_TWO.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test
    public void testDrawFourCardGood() {
        System.out.println("draw four card good");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.WILD_DRAW_FOUR.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.WILD_DRAW_FOUR.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
      public void testDrawFourCardBad() {
        System.out.println("draw four card bad");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.NUMBER.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertFalse(hand.getCardValue().equals(GroupOfCards.CardType.WILD_DRAW_FOUR.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
      public void testDrawFourCardBoundary() {
        System.out.println("wild draw four card boundary");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.WILD_DRAW_FOUR.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.WILD_DRAW_FOUR.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testColorCardGood() {
        System.out.println("wild color card good");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.WILD_COLOR.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.WILD_COLOR.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
      public void testColorCardBad() {
        System.out.println("wild color card bad");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.NUMBER.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertFalse(hand.getCardValue().equals(GroupOfCards.CardType.WILD_COLOR.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
      public void testColorCardBoundary() {
        System.out.println("wild color card boundary");
        Player p = new Player("Lyn");
        Deck deck=new Deck();
        deck.createCard();
  
        PlayerList listOfPlayers = new PlayerList(); 
        GroupOfCards hand=new GroupOfCards(GroupOfCards.CardType.WILD_COLOR.toString(),deck.shuffle().get(0).getCardColor());
        p.addHandCard(hand); //initial hand card of player consists of 7 card
        listOfPlayers.addPlayer(p);
        DiscardPile discard=new DiscardPile();
        discard.addDiscard(hand);

        
        GroupOfCards top = discard.getTopCard();
        GroupOfCards selected = hand ;
        CardRules instance = new CardRules();

        instance.actionCard(1,listOfPlayers.getPlayerList(),hand);
        assertTrue(hand.getCardValue().equals(GroupOfCards.CardType.WILD_COLOR.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
    