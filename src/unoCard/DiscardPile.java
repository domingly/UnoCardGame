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
public class DiscardPile extends Deck {
    private final Stack<GroupOfCards> cards = new Stack<>();

    public Stack<GroupOfCards> getCards() {
        return cards;
    }
    

    public DiscardPile(GroupOfCards shuffledCards) {
        cards.add(shuffledCards);
    }

    public DiscardPile() {
    }
    
    public void addDiscard(GroupOfCards shuffledCards){
            cards.push(shuffledCards);
    }

    public Stack<GroupOfCards> getDiscardCard() {
        return cards;
    }
    public GroupOfCards getTopCard() {
        return cards.peek();
    }

    public GroupOfCards drawCard() {
        return cards.pop();
    }

    public int getSize() {
        return cards.size();
    }
}
