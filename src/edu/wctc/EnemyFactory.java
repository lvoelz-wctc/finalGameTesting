package edu.wctc;

import java.util.Random;

public class EnemyFactory {

    public EnemyFactory(){}

    public Enemy create(){
        Random r = new Random();
        int lowerBound = 1;
        int upperBound = 4;
        int result = r.nextInt(upperBound-lowerBound) + lowerBound;

        if (result == 1){
            return new Bandit();
        }
        else if (result == 2){
            return new Sorcerer();
        }
        else if (result == 3 ){
            return new Dragon();
        }
        else {
            return new Serpent();
        }
    }

}
