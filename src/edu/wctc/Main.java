package edu.wctc;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ready to fight? Y/N");
        String input = scanner.nextLine();

        if (input.equals("Y")){
            EnemyDriver ed = new EnemyDriver();
            Enemy e = ed.createEnemy();
            System.out.println(ed.showEnemy(e));
            System.out.println(ed.showAttack(e));

            //call player driver here.
            //need a player class too.
        }
    }
}
