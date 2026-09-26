package oop.advanced.heroes;

import oop.advanced.Enemy;

public class Archer extends Hero {
    public static final int DAMAGE = 20;

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
    }
}
