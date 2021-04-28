package edu.wctc;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int score = 100;
        int turns = 0;
        int turnMult = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Fantasy Battle! Enter your name.");
        String name = scanner.nextLine();

        //Try enemyDriver again but have the class accept Enemy e
        /** PLAYER DRIVER VERSION
        PlayerDriver pd = new PlayerDriver();
        Player p = pd.createPlayer();
        p.setName(name); //this should probably go in the factory or driver.
        System.out.println(pd.showPlayer(p));**/

        /**PLAYER FACTORY ONLY VERSION**/
        PlayerFactory pf = new PlayerFactory();
        Player p = pf.create();
        p.setName(name);
        System.out.println("Hello, " + p.getName() + ". Ready to fight?");
        String input = scanner.nextLine();

        if (input.equals("Y")){
            /**Can we put below in EnemyDriver?**/
            EnemyFactory ef = new EnemyFactory();
            Enemy e = ef.create();
            EnemyDriver ed = new EnemyDriver(e);
            System.out.println(ed.showEnemy());

            do {
                /**Enemy attacks**/
                System.out.println(ed.showAttack());
                int damage = ed.returnDamage();
                System.out.println(ed.showDamage() + damage + " damage!");
                p.setHealth(p.getHealth() - damage);
                System.out.println("Your health is now: " + p.getHealth());
                //test if player health < 0;
                if (p.getHealth() <= 0){
                    turns++;
                    break;
                }

                /**Player actions**/
                System.out.println("Your turn! Enter A to attack or P to drink a potion.");
                String playerAction = scanner.nextLine();
                if (playerAction.equals("A")){
                    int pDamage = p.calculateDamage();
                    System.out.println("You hit the " + e.getName() + " for " + pDamage + " damage!");
                    e.setHealth(e.getHealth()-pDamage);
                    System.out.println("Enemy health: "+ e.getHealth());
                }
                else if (playerAction.equals("P")){
                    int potion = p.drinkPotion();
                    System.out.println("You drink a potion and restore " + potion + " health.");
                    p.setHealth(p.getHealth()+potion);
                }
                turns++;
            }

            while (e.getHealth() > 0 && p.getHealth() > 0);
            score = score - (turns * turnMult);
            if (e.getHealth() <= 0) {
                System.out.println("You defeated the " +e.getName() + "!");
                System.out.println("Your score is " + score +".");
            }
            if (p.getHealth() <= 0){
                System.out.println("The " + e.getName() + " defeated you!");
            }
        }
    }
}
