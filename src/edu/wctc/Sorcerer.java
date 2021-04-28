package edu.wctc;

import java.util.Random;

public class Sorcerer extends Humanoid {

    private String name = "Sorcerer";
    private String attack = "casts fireball!";
    private int health = 100;

    @Override
    public int calculateHealth(int damage) {
        return 0;
    }

    @Override
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    @Override
    public int calculateDamage() {
        Random r = new Random();
        int lowerBound = 5;
        int upperBound = 15;
        int result = r.nextInt(upperBound-lowerBound) + lowerBound;
        return result;
    }

    @Override
    public String showAttack() {
        return attack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }
}
