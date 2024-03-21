package org.example;

public enum Weapon {
    SWORD(5, 2.5),
    ARROW(2, 5.5),
    AXE(8, 1.5);

    private int damage;
    private double attackSpeed;

    private Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
