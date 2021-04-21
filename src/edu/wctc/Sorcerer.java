package edu.wctc;

public class Sorcerer extends Humanoid {

    private String name = "Sorcerer";
    private String attack = "casts fireball!";

    @Override
    public String showAttack() {
        return attack;
    }

    @Override
    public String showYell() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
