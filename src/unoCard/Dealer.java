/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoCard;


/**
 *
 * @author Lyn
 */
public class Dealer extends Deck {
    public static final int INIT_HAND_CARDS = 7; 


    public Dealer(){
        super.createCard();
    }
    public void deckCard(){
        DrawPile drawPile = new DrawPile(super.shuffle());
    }
       public DrawPile shuffleCard(){
        return new DrawPile(super.shuffle());
    }
     public static GroupOfCards[] dealInitHandCards(DrawPile drawPile, int totalPlayers) {
      
        return null;
      
     }
}
