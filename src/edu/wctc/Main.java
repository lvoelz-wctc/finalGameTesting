package edu.wctc;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
            EnemyFactory ef = new EnemyFactory();
            Enemy e = ef.create();

            /**Do While e.gethealth()>0. Can we put below in a Main method?**/
            EnemyDriver ed = new EnemyDriver(e);
            System.out.println(ed.showEnemy());
            System.out.println(ed.showAttack());
            int damage = ed.returnDamage();
            System.out.println(ed.showDamage() + damage + " damage!");
            p.setHealth(p.getHealth()-damage);
            System.out.println("Your health is now: " + p.getHealth());








            /**DAMAGE IN MAIN VERSION - NO ENEMY DRIVER
            int damage = e.calculateDamage();
            System.out.println("The " + e.getName() + " hits you for " + damage + " damage!");
            System.out.println("Your health is now: " + p.calculateHealth(damage));
            p.setHealth(p.getHealth()-damage);
            **/


            /**NO ENEMY DRIVER VERSION
            System.out.println("You see a " + e.getName()+"!");
            System.out.println("The " + e.getName() + " " + e.showAttack());
            **/

            //Could we run a DamageCalculator version that accepts a being and then returns a value?
            //That would allow us to have damage outside the EnemyDriver
            //actually keep damage per being so can be customized per being if desired later
        }
    }
}
