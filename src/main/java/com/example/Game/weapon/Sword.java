package com.example.Game.weapon;

public class Sword implements Weapon { // 3

    private String name;
    private int damage;

    public Sword(String name, int damage){
        this.name = name;
        this.damage = damage;
    }


    @Override                   // 34
    public String getName(){
        return name;
    }
    @Override                   // 35
    public int getDamage(){
        return damage;
    }

    @Override
    public  void attack(){
        System.out.println("Sword attack with damage - " + damage + " !");
    }
}

