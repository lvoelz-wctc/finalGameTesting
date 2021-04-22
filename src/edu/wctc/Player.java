package edu.wctc;

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

    @Override
    public int calculateHealth(int damage) {
        return (health - damage);
    }

    @Override
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    @Override
    public int calculateDamage() {
        return 0;
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
