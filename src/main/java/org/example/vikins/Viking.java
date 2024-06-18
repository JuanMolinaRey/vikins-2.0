package org.example.vikins;

import org.example.soldier.Soldier;

public class Viking extends Soldier {
    public String name = "Harald";
    private String msg;

    public Viking(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String battleCry(){
        return "Odin Owns You All!";
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);

        if (health > 0) {
            setMsg(name + "has received" + damage + "points of damage");
        }
        else  {
            setMsg(name + "has died in combat");
        }
    }
    public int attack() {
        return super.attack();

    }

}