package oop.advanced.heroes;

import oop.advanced.Enemy;

public class Mage extends Hero {
    public static final int DAMAGE = 30;

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
    }
}
