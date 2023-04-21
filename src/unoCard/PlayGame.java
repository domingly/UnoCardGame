/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unoCard;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lyn
 */
public class PlayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Dealer deck=new Dealer(); //generate uno card 
        // deck.drawPile();
         PlayerList p=new PlayerList();
      //   System.out.println(deck.createCard().size()); //total size of uno card generated
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of player:"); //enter the number of player
        int numberOfPlayer=input.nextInt();
        
        
        for(int i=1;i<=numberOfPlayer;i++){
           
            System.out.println("Enter player " + i + " username:");
            String username=input.next(); //enter each player username
           // System.out.println(username);
            Player pl=new Player(username); // set new username in player
            //p.setName(username);
        
               for(int x=0;x<7;x++){
                GroupOfCards hand=new GroupOfCards(deck.shuffle().get(x).getCardValue(),deck.shuffle().get(x).getCardColor());
                pl.addHandCard(hand); //initial hand card of player consists of 7 card
                deck.removeCard(x); //remove the card in the deck
              }
                // System.out.println(deck.shuffle().size());
                   p.addPlayer(pl); //add the player in player list array
        }
                DrawPile draw=new DrawPile(deck.shuffle()); //shuffle the card
               System.out.println(draw.getSize()); //for checking only if the total size of draw same with the remaining card.
              
             
                  DiscardPile discard=new DiscardPile();  //set constructor for discard file
                 Player.direction=Player.Direction.CLOCKWISE; //set the direction to CLOCKWISE
                    //     System.out.println(Player.direction.toString());
                int curr=0; //begin index 0 of the player list.
                
                //test the game
                   discard.addDiscard(draw.drawCards()); //Assign top card
                    draw.removeCard(draw.drawCards()); //remove card in draw.
               while(true){
                    //check if the initial band card is not empty.
                    if( !p.getPlayerList().get(curr).getHandCards().isEmpty()){ 
                    //System.out.println(p.getPlayerList().get(curr).getHandCards().size());
                    System.out.println("Your turn " + p.getPlayerList().get(curr).getName()); //name of the player
                     for(int z=0;z<p.getPlayerList().get(curr).getHandCards().size();z++){
                          System.out.println("[" + z + "] " +p.getPlayerList().get(curr).getHandCards().get(z).getCardValue() + " " + p.getPlayerList().get(curr).getHandCards().get(z).getCardColor().toString());
                     }
                 
                    System.out.println("Top Card " + discard.getTopCard().getCardValue() + " " + discard.getTopCard().getCardColor().toString());
                     System.out.print("Pick a card: ");
                     int pick=input.nextInt();
                     try{
                        GroupOfCards c =p.getPlayerList().get(curr).getHandCards(p.getPlayerList().get(curr).getSize(),pick); 
                                     System.out.println("discard" + " " + discard.getSize());
                    if(discard.getSize()==0){ //if dicard pile is empty

                     discard.addDiscard(p.getPlayerList().get(curr).getHandCards().get(pick)); //add the selected card in discard pile
                     p.getPlayerList().get(curr).getHandCards().remove(pick); //remove the selected card in hand card.
                     curr=p.getNextPlayer(curr); //move to the next player
                    }else{
                        //if not, check the last discard using peek if available in the handcard of the players.
                      
                
                        try{
                            System.out.println(deck.checkCard(discard.getTopCard(),p.getPlayerList().get(curr).getHandCards().get(pick)));
                            deck.actionCard(curr, p.getPlayerList(),p.getPlayerList().get(curr).getHandCards().get(pick));
 
     
                            discard.addDiscard(p.getPlayerList().get(curr).getHandCards().get(pick)); //add the selected card in discard pile
                             p.getPlayerList().get(curr).getHandCards().remove(pick);


                        curr=p.getNextPlayer(curr);
                        }catch(IllegalArgumentException e){
                             //System.out.println(e);
                              p.getPlayerList().get(curr).addHandCard(draw.drawCards()); //add the card in player hand card list
                             draw.removeCard(draw.drawCards());
                             curr=p.getNextPlayer(curr);
                        }
                        
                         if(p.declareWinner(p.getPlayerList().get(curr))){
                             System.out.println(p.getPlayerList().get(curr).getName() + " Say Uno");
                             break;
                         }
        
                        
                    }
                     }catch(IllegalArgumentException e){
                         System.out.println(e);
                     }
                     
      
               
                    }
                }   
        //deck.shuffle();
       
       
     
    }

    
}
