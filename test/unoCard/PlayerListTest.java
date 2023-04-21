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
public class PlayerListTest {
    
    public PlayerListTest() {
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
     * Test of totalPlayer method, of class PlayerList.
     */
    @Test
    public void testTotalPlayerGood() {
        System.out.println("totalPlayer good");
        Player p = new Player("Lyn");
        PlayerList listOfPlayers = new PlayerList();
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.totalPlayer()>0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testTotalPlayerBad() {
        System.out.println("totalPlayer bad");
        Player p = null;
        PlayerList listOfPlayers = new PlayerList();
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.totalPlayer()>0);
    }
    @Test
    public void testTotalPlayerBoundary() {
        System.out.println("totalPlayer boundary");
        Player p = new Player("Lyn");
        PlayerList listOfPlayers = new PlayerList();
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.totalPlayer()>0);
    }

    
    
    /**
     * Test of addPlayer method, of class PlayerList.
     */
    @Test
    public void testAddPlayerGood() {
        System.out.println("addPlayer - good");
        Player p = new Player("Lyn");
        PlayerList listOfPlayers = new PlayerList();
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.getPlayerList().contains(p));
        // TODO rleview the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddPlayerBad() {
        System.out.println("addPlayer - bad");
        Player p = null;
        PlayerList listOfPlayers = new PlayerList();
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.getPlayerList().contains(p));
        // TODO rleview the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddPlayerBoundary() {
        System.out.println("addPlayer - boundary");
        Player p = new Player("Lyn");
        PlayerList listOfPlayers = new PlayerList();
        listOfPlayers.addPlayer(p);
        assertTrue(listOfPlayers.getPlayerList().contains(p));
        // TODO rleview the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }


    
}
