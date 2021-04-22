package edu.wctc;
import java.util.Random;

public class EnemyDriver {

    public EnemyDriver(){}

    public Enemy createEnemy() {
        Random r = new Random();
        int lowerBound = 1;
        int upperBound = 4;
        int result = r.nextInt(upperBound-lowerBound) + lowerBound;

        EnemyFactory ef = new EnemyFactory();
        return ef.create();
    }

    public String showEnemy(Enemy e){
        return "You see a " + e.getName() + "!";
    }

    public String showAttack(Enemy e){
        return "The " + e.getName() + " " + e.showAttack() + "!";
    }

    public String showDamage(Enemy e) {return "The " + e.getName() + " hits you for " + e.calculateDamage() + " damage!";}
}
