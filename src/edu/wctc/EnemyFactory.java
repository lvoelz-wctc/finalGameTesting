package edu.wctc;

public class EnemyFactory {

    public EnemyFactory(){}

    public Enemy create(int r){
        if (r == 1){
            return new Bandit();
        }
        else if (r == 2){
            return new Sorcerer();
        }
        else if (r == 3 ){
            return new Dragon();
        }
        else {
            return new Serpent();
        }
    }

}
