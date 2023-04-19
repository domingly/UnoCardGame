/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Lyn
 */
public class Deck extends CardRules {
    protected ArrayList<GroupOfCards> cards=new ArrayList<>();
      private Random rand;
      public Deck() {
        rand = new Random();

    }
    public ArrayList<GroupOfCards> createCard(){
           //for normal card value one to nine
           for (int i=1; i<=9; i++) {
            for (int x=0; x<2; x++) {
                cards.add(new GroupOfCards(Integer.toString(i),GroupOfCards.CardColor.BLUE));
                cards.add(new GroupOfCards(Integer.toString(i),GroupOfCards.CardColor.GREEN));
                cards.add(new GroupOfCards(Integer.toString(i),GroupOfCards.CardColor.RED));
                cards.add(new GroupOfCards(Integer.toString(i),GroupOfCards.CardColor.YELLOW));
            }
                 }
            //for card value zero.
           for (int j=0; j<1; j++) {
            cards.add(new GroupOfCards(Integer.toString(0),GroupOfCards.CardColor.BLUE));
            cards.add(new GroupOfCards(Integer.toString(0),GroupOfCards.CardColor.GREEN));
            cards.add(new GroupOfCards(Integer.toString(0),GroupOfCards.CardColor.YELLOW));
            cards.add(new GroupOfCards(Integer.toString(0),GroupOfCards.CardColor.RED));
        }
         for (int j=0; j<2; j++) {
            cards.add(new GroupOfCards(GroupOfCards.CardType.DRAW_TWO.toString(),GroupOfCards.CardColor.BLUE));
            cards.add(new GroupOfCards(GroupOfCards.CardType.DRAW_TWO.toString(),GroupOfCards.CardColor.GREEN));
            cards.add(new GroupOfCards(GroupOfCards.CardType.DRAW_TWO.toString(),GroupOfCards.CardColor.YELLOW));
            cards.add(new GroupOfCards(GroupOfCards.CardType.DRAW_TWO.toString(),GroupOfCards.CardColor.RED));
            cards.add(new GroupOfCards(GroupOfCards.CardType.REVERSE.toString(),GroupOfCards.CardColor.BLUE));
            cards.add(new GroupOfCards(GroupOfCards.CardType.REVERSE.toString(),GroupOfCards.CardColor.GREEN));
            cards.add(new GroupOfCards(GroupOfCards.CardType.REVERSE.toString(),GroupOfCards.CardColor.YELLOW));
            cards.add(new GroupOfCards(GroupOfCards.CardType.REVERSE.toString(),GroupOfCards.CardColor.RED));
            cards.add(new GroupOfCards(GroupOfCards.CardType.SKIP.toString(),GroupOfCards.CardColor.BLUE));
            cards.add(new GroupOfCards(GroupOfCards.CardType.SKIP.toString(),GroupOfCards.CardColor.GREEN));
            cards.add(new GroupOfCards(GroupOfCards.CardType.SKIP.toString(),GroupOfCards.CardColor.YELLOW));
            cards.add(new GroupOfCards(GroupOfCards.CardType.SKIP.toString(),GroupOfCards.CardColor.RED));
        }
        for (int p=0; p<4; p++) {
            cards.add(new GroupOfCards(GroupOfCards.CardType.WILD_COLOR.toString(),GroupOfCards.CardColor.NONE));
             cards.add(new GroupOfCards(GroupOfCards.CardType.WILD_DRAW_FOUR.toString(),GroupOfCards.CardColor.NONE));
        }
   //Collections.shuffle(cards);
   return cards;
    }
//    public void shuffle(){
//        Collections.shuffle(cards);
//    }
       public ArrayList<GroupOfCards>  shuffle() {
          // var rand = new Random();

        for (int current = 0; current < cards.size() - 1; current++) {
            // get a random index for remaining positions, i.e. [i, CARDS_SIZE - 1)
            int randomIndex = current + rand.nextInt(cards.size() - current);

             GroupOfCards randomCard = cards.get(randomIndex);

        cards.set(randomIndex, cards.get(current));
        cards.set(current, randomCard);
        }
//        for (int i=0; i<1 * cards.size(); i++) {
//            int x = rand.nextInt(cards.size());
//            int y = rand.nextInt(cards.size());
//            GroupOfCards temp = cards.get(x);
//            cards.set(x,cards.get(y));
//            cards.set(y,temp);
//        }
        return cards;
    }
       public void drawPile(){
           
       }
       public void removeCard(int i){
           cards.remove(i);
       }
}
