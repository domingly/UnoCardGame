/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoCard;

import unoCard.GroupOfCards.CardType;

/**
 *
 * @author Lyn
 */
public class CardRules {
    public boolean checkCard(GroupOfCards top,GroupOfCards selected) throws IllegalArgumentException{
        System.out.println(" top " + top.getCardColor().toString());
         System.out.println(" selected " + selected.getCardColor().toString());
        if(top.getCardColor().toString().equals(selected.getCardColor().toString()) ||  top.getCardValue().equals(selected.getCardValue())){
            return true;
        }
        else{
            throw new IllegalArgumentException("Invalid card");
        }
    } 
    public void actionCard(GroupOfCards selected){
        if(selected.getCardValue().equals(CardType.SKIP.toString())){
            
        }
        else if(selected.getCardValue().equals(CardType.DRAW_TWO.toString())){
            Player.direction=Player.Direction.COUNTER_CLOCKWISE;
        }
          else if(selected.getCardValue().equals(CardType.REVERSE.toString())){
            
        }
          else if(selected.getCardValue().equals(CardType.WILD_COLOR.toString())){
            
        }
          else if(selected.getCardValue().equals(CardType.WILD_DRAW_FOUR.toString())){
            
        }
    }
    
}
