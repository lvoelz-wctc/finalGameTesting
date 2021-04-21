package edu.wctc;

public class Dragon implements Beast {

    private String name = "Dragon";
    private String attack = "breaths fire!";

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
