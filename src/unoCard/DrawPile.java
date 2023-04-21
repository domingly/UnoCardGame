/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoCard;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author Lyn
 */
public class DrawPile extends DiscardPile {
    private final Stack<GroupOfCards> cards = new Stack<>();
    public DrawPile(){
        
    }
    public DrawPile(List<GroupOfCards> shuffledCards) {
        cards.addAll(shuffledCards);
    }

//    public GroupOfCards drawCard() {
//        return cards.pop();
//    }
        
    @Override
    public int getSize() {
        return cards.size();
    }

     public GroupOfCards drawCards() {
         if(cards.isEmpty()){
            cards.addAll(super.getDiscardCard());
        }
        return cards.peek();
    }
     public void removeCard(GroupOfCards card){
         cards.remove(card);
     }
    @Override
    public Stack<GroupOfCards> getCards() {
        return cards;
    }
    
}
