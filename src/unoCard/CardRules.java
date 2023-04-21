/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoCard;

import java.util.ArrayList;
import unoCard.GroupOfCards.CardType;

/**
 *
 * @author Lyn
 */
public class CardRules{
    public boolean checkCard(GroupOfCards top,GroupOfCards selected) throws IllegalArgumentException{
        System.out.println(" top " + top.getCardColor().toString());
         System.out.println(" selected " + selected.getCardColor().toString());
         boolean result=false;

          

      if(!selected.getCardValue().equals(CardType.WILD_COLOR.toString()) || !selected.getCardValue().equals(CardType.WILD_DRAW_FOUR.toString())){
          if(top.getCardColor().toString().equals(selected.getCardColor().toString()) ||  top.getCardValue().equals(selected.getCardValue())){
              result=true;
        }
        else{
              return false;
//            throw new IllegalArgumentException("Invalid card");
        } 
      }
          return result;
    } 
    public void actionCard(int curr,ArrayList<Player> player,GroupOfCards selected){
        if(selected.getCardValue().equals(CardType.SKIP.toString())){
               System.out.println("SKIP");
        }
        else if(selected.getCardValue().equals(CardType.DRAW_TWO.toString())){
              System.out.println("DRAW CARD");
           //   player.get(curr + 1).addHandCard();
        }
          else if(selected.getCardValue().equals(CardType.REVERSE.toString())){
            Player.direction=Player.Direction.COUNTER_CLOCKWISE;
        }
          else if(selected.getCardValue().equals(CardType.WILD_COLOR.toString())){
              System.out.println("Wild Color");
            
        }
          else if(selected.getCardValue().equals(CardType.WILD_DRAW_FOUR.toString())){
              System.out.println("Wild Four");
            
        }
    }
    
}
