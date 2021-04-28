package edu.wctc;
import java.util.Random;

public class EnemyDriver {

    private Enemy e;

    /**This should accept an enemy and not a being because we'll never be sending a player**/
    public EnemyDriver(Enemy e){
        this.e = e;
    }

    /**public Enemy createEnemy() {
        Random r = new Random();
        int lowerBound = 1;
        int upperBound = 4;
        int result = r.nextInt(upperBound-lowerBound) + lowerBound;

        EnemyFactory ef = new EnemyFactory();
        return ef.create();
    }**/

    //Should these be broken out into different EnemyDriver subclasses?
    public String showEnemy(){
        return "You see a " + e.getName() + "!";
    }

    public String showAttack(){
        return "The " + e.getName() + " " + e.showAttack() + "!";
    }

    public String showDamage() {return "The " + e.getName() + " hits you for ";}

    public Integer returnDamage() {return e.calculateDamage();}


}
