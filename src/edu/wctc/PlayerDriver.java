package edu.wctc;

public class PlayerDriver {

    public PlayerDriver(){}

    public Player createPlayer(){
        return new Player();
    }

    public String showPlayer(Player p){
        return "Hello, " + p.getName() + ". Ready to fight? Y/N.";
    }

}
