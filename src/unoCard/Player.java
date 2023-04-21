/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package unoCard;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public  class Player  {

    protected String name; //the unique name for this player
    private final ArrayList<GroupOfCards> handCards=new ArrayList<>();

    public enum Direction{
        COUNTER_CLOCKWISE,
        CLOCKWISE
    }
    public static Direction direction;

    
    public Direction getDirection() {
        return direction;
    }

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param direction
     * @param name the unique ID to assign to this player.
     */
    public void addHandCard(GroupOfCards g){
        handCards.add(g);
    }
        
                 public GroupOfCards getCard(int index){

        return handCards.get(index);
       
    }
   


    public ArrayList<GroupOfCards> getHandCards() {
        return handCards;
    }
    public int getSize(){
        return handCards.size();
    }
    public GroupOfCards getHandCards(int size,int i) throws IllegalArgumentException{
        System.out.println(size);
      if(i > size){
          throw new IllegalArgumentException("Array out of bounds");
      }else{
           return handCards.get(i);
      }
       
     
    }
    public Player(){
        
    }
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }
    public boolean declareWinner(Player p){
        if(p.getHandCards().size()==1){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */


}