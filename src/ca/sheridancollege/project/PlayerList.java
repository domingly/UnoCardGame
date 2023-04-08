/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Lyn
 */
public class PlayerList extends Player {

        protected ArrayList<Player> playerList=new ArrayList<>();
         public Player getPlayer(int index){
             
        return playerList.get(index);
       
    }
          public void addPlayer(Player p){
        playerList.add(p);
    }
              public ArrayList<Player> getPlayerList() {
        return playerList;
    }
    //method for next player.   
     public int getNextPlayer(int curr) {
        int increment = Player.direction == Player.Direction.CLOCKWISE ? 1 : -1;
        System.out.println(curr);
        System.out.println(increment);
        return (playerList.size() + curr + increment) % playerList.size();
    }
    
}

