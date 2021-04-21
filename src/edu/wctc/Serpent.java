package edu.wctc;

public class Serpent implements Beast {

    private String name = "Serpent";
    private String attack = "casts waterfall!";

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
