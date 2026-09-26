package oop.advanced.heroes;

import oop.advanced.Enemy;

public class Warrior extends Hero {
    public static final int DAMAGE = 40;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
    }
}
