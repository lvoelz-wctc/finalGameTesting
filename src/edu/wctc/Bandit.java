package edu.wctc;

public class Bandit extends Humanoid {

    private String name = "Bandit";
    private String attack = "fires his bow!";

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
