/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca.sheridancollege.project;

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
         Deck deck=new Deck(); //generate uno card 
         PlayerList p=new PlayerList();
         System.out.println(deck.fillDeck().size()); //total size of uno card generated
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of player"); //enter the number of player
        int numberOfPlayer=input.nextInt();
        
        
        for(int i=1;i<=numberOfPlayer;i++){
           
            System.out.println("Enter username:");
            String username=input.next(); //enter each player username
            System.out.println(username);
            Player pl=new Player(username); // set new username in player
            //p.setName(username);
        
               for(int x=0;x<7;x++){
                GroupOfCards hand=new GroupOfCards(deck.shuffle().get(x).getCardValue(),deck.shuffle().get(x).getCardColor());
                pl.addHandCard(hand); //initial hand card of player consists of 7 card
                deck.removeCard(x); //remove the card in the deck
              
       
        }
                 System.out.println(deck.shuffle().size());
                   p.addPlayer(pl); //add the player in player list array
        }
                DrawPile draw=new DrawPile(deck.shuffle()); //shuffle the card
               //  System.out.println(draw.getSize()); for checking only if the total size of draw same with the remaining card.
              
               
               //display the list of initial hand card of each players
                 for(int y=0;y<p.getPlayerList().size();y++){
                     System.out.println(p.getPlayerList().get(y).getName());
                     for(int z=0;z<p.getPlayerList().get(y).getHandCards().size();z++){
                          System.out.println(p.getPlayerList().get(y).getHandCards().get(z).getCardValue() + p.getPlayerList().get(y).getHandCards().get(z).getCardColor().toString());
                     }
                 }
             
                  DiscardPile discard=new DiscardPile();  //set constructor for discard file
                 Player.direction=Player.Direction.CLOCKWISE; //set the direction to CLOCKWISE
                         System.out.println(Player.direction.toString());
                int curr=0; //begin index 0 of the player list.
                
                //test the game
               while(true){
                    //check if the initial band card is not empty.
                    if( !p.getPlayerList().get(curr).getHandCards().isEmpty()){ 
                    //System.out.println(p.getPlayerList().get(curr).getHandCards().size());
                    int random=(int) (Math.random() * p.getPlayerList().get(curr).getHandCards().size()); //generate random index.
                    System.out.println("Your turn " + p.getPlayerList().get(curr).getName()); //name of the player
                     GroupOfCards c =p.getPlayerList().get(curr).getHandCards().get(random);
                   System.out.println("discard" + " " + discard.getSize());
                    if(discard.getSize()==0){ //if dicard pile is empty
                       System.out.println(discard.getSize() + "true");
                          System.out.println(p.getPlayerList().get(curr).getHandCards().get(random).getCardValue() + " " + p.getPlayerList().get(curr).getHandCards().get(random).getCardColor().toString() + "discard");
                     discard.addDiscard(p.getPlayerList().get(curr).getHandCards().get(random)); //add the selected card in discard pile
                     p.getPlayerList().get(curr).getHandCards().remove(random); //remove the selected card in hand card.
                     curr=p.getNextPlayer(curr); //move to the next player
                    }else{
                        //if not, check the last discard using peek if available in the handcard of the players.
                        //
                        int index=p.getPlayerList().indexOf(discard.getCards().peek());
                        System.out.println(p.getPlayerList().get(curr).getHandCards().get(random).getCardValue() + p.getPlayerList().get(curr).getHandCards().get(random).getCardColor().toString());
                        System.out.println(p.getPlayerList().indexOf(discard.getCards().peek()) + " true");
                        if(index!=-1){
                            System.out.println(p.getPlayerList().get(curr).getHandCards().get(p.getPlayerList().indexOf(index)) + " selected");
                        }
                        else{
                                p.getPlayerList().get(curr).addHandCard(draw.getCards().peek()); //add the card in player hand card list
                                System.out.println(draw.getCards().peek().getCardColor().toString() + " " + draw.getCards().peek().getCardValue() + "draw");
                                draw.getCards().remove(draw.getCards().peek());
                                System.out.println("false");
                        }

//                     discard.addDiscard(p.getPlayerList().get(curr).getHandCards().get(random));
//                     p.getPlayerList().get(curr).getHandCards().remove(random);
                        curr=p.getNextPlayer(curr);
                    }
               
                    }
                }   
        //deck.shuffle();
       
       
     
    }

    
}
