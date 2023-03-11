/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author Lyn
 */
public class DrawPile {
    private final Stack<Card> cards = new Stack<>();

    public DrawPile(List<Card> shuffledCards) {
        cards.addAll(shuffledCards);
    }

    public Card drawCard() {
        return cards.pop();
    }

    public int getSize() {
        return cards.size();
    }
}
