package edu.wctc;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Fantasy Battle! Enter your name.");
        String name = scanner.nextLine();


        /** DRIVER VERSION
        PlayerDriver pd = new PlayerDriver();
        Player p = pd.createPlayer();
        p.setName(name); //this should probably go in the factory or driver.
        System.out.println(pd.showPlayer(p));**/

        /**FACTORY ONLY VERSION**/
        PlayerFactory pf = new PlayerFactory();
        Player p = pf.create();
        p.setName(name);
        System.out.println("Hello, " + p.getName() + ". Ready to fight?");
        String input = scanner.nextLine();

        if (input.equals("Y")){
            /**DRIVER VERSION
            EnemyDriver ed = new EnemyDriver();
            Enemy e = ed.createEnemy();
            System.out.println(ed.showEnemy(e));
            System.out.println(ed.showAttack(e));**/

            /**FACTORY ONLY VERSION**/
            EnemyFactory ef = new EnemyFactory();
            Enemy e = ef.create();

            System.out.println("You see a " + e.getName()+"!");
            System.out.println("The " + e.getName() + " " + e.showAttack());

            //Could we run a DamageCalculator version that accepts a being and then returns
            //the results accordingly???
            int damage = e.calculateDamage();
            System.out.println("The " + e.getName() + " hits you for " + damage + " damage!");
            System.out.println("Your health is now: " + p.calculateHealth(damage));
            p.setHealth(p.getHealth()-damage);

        }
    }
}
