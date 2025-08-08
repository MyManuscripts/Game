package com.example.Game;

public class Axe implements Weapon{  // 30

    // поля для axe
    private String name;
    private int damage;

    // конструктор
    public Axe(String name, int damage){
        this.name = name;
        this.damage = damage;
    }




    @Override                   // 31
    public String getName(){
        return name;
    }
    @Override                   // 32
    public int getDamage(){
        return damage;
    }

    @Override
    public void attack(){
        System.out.println("Axe attack with damage - " + damage + " !");
    }
}
