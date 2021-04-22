package edu.wctc;

public class DamageCalculator {

    private Being b;

    public DamageCalculator(Being b){
        this.b=b;
    }

    public Integer returnDamage() {return b.calculateDamage();}

}
