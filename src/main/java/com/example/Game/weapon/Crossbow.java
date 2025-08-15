package com.example.Game.weapon;

public class Crossbow implements Weapon {
    String name;
    int damage;

    public Crossbow(String name, int damage){
        this.name=name;
        this.damage=damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage(){
        return  damage;
    }

    @Override
    public void attack(){
        System.out.println("Crossbow attack with damage: " + damage);
    }
}
