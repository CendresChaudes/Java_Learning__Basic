package oop.advanced;

import oop.advanced.heroes.Archer;
import oop.advanced.heroes.Mage;
import oop.advanced.heroes.Warrior;

public class BattleGround {

    public static void start() {
        System.out.println("Battle start");

        Archer archer = new Archer("James");
        Mage mage = new Mage("Oliver");
        Warrior warrior = new Warrior("Tommy");
        Enemy enemy = new Enemy("Bear", 80);

        archer.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        warrior.attackEnemy(enemy);

        System.out.println("Battle end");
    }
}
