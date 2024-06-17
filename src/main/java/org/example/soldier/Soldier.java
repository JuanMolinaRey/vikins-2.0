package org.example.soldier;

public class Soldier {
    public int health = 300;
    public int strength = 150;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int attack(){
        return strength;
    }

    public void receiveDamage(int damage){
        health = health - damage;
    }
}
