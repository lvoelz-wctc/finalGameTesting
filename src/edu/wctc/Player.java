package edu.wctc;

import java.util.Random;

public class Player implements Being{

    public String name;
    private int health = 100;

    public Player() {
    }

    //unique Player classes
    public int usePotion(){
        return 0;
    }

    public int getHealth(){
        return health;
    }

    public void setName(String name){
        this.name = name;
    }

    public int drinkPotion(){
        Random r = new Random();
        int lowerBound = 5;
        int upperBound = 15;
        int potion = r.nextInt(upperBound-lowerBound) + lowerBound;
        return potion;
    }

    @Override
    public int calculateHealth(int damage) {
        return (health - damage);
    }

    @Override
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    @Override
    public int calculateDamage(){
        Random r = new Random();
        int lowerBound = 5;
        int upperBound = 15;
        int result = r.nextInt(upperBound-lowerBound) + lowerBound;
        return result;
    }

    @Override
    public String showAttack() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
