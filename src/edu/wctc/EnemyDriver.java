package edu.wctc;
import java.util.Random;

public class EnemyDriver {

    private Being b;

    public EnemyDriver(Being b){
        this.b = b;
    }

    /**public Enemy createEnemy() {
        Random r = new Random();
        int lowerBound = 1;
        int upperBound = 4;
        int result = r.nextInt(upperBound-lowerBound) + lowerBound;

        EnemyFactory ef = new EnemyFactory();
        return ef.create();
    }**/

    public String showEnemy(){
        return "You see a " + b.getName() + "!";
    }

    public String showAttack(){
        return "The " + b.getName() + " " + b.showAttack() + "!";
    }

    public String showDamage() {return "The " + b.getName() + " hits you for ";}

    public Integer returnDamage() {return b.calculateDamage();}
}
