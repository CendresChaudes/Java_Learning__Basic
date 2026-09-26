package oop.advanced.heroes;

import oop.advanced.Enemy;

public abstract class Hero {

    private final String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
}
