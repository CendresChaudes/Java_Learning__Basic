package oop.advanced;

public class Enemy {
    private final String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        this.checkIsAlive();
    }

    private void checkIsAlive() {
        if (this.health <= 0) {
            System.out.println(this.name + " is dead");
        }
    }
}
