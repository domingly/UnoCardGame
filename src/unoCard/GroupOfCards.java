/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package unoCard;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards extends Card {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    @Override
    public String toString() {
       return "Uno Card";
    }
    
    public enum CardColor {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    BLACK
    }
    public enum CardType {
    SKIP,
    REVERSE,
    DRAW_TWO,
    WILD_COLOR,
    WILD_DRAW_FOUR,
    NUMBER
    
    }
     private CardType cardType;
     private CardColor cardColor;
     protected String cardValue;

    public String getCardValue() {
        return cardValue;
    }
     
    public GroupOfCards(int size) {
        this.size = size;
    }

    public GroupOfCards(String value, CardColor cardColor) {
        this.cardValue = value;
        this.cardColor = cardColor;
    }


    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardColor getCardColor() {
        return cardColor;
    }

    public void setCardColor(CardColor cardColor) {
        this.cardColor = cardColor;
    }


    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

}//end class
