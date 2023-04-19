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
public class DrawPile {
    private final Stack<GroupOfCards> cards = new Stack<>();

    public DrawPile(List<GroupOfCards> shuffledCards) {
        cards.addAll(shuffledCards);
    }

    public GroupOfCards drawCard() {
        return cards.pop();
    }
        
    public int getSize() {
        return cards.size();
    }

    public Stack<GroupOfCards> getCards() {
        return cards;
    }
    
}
