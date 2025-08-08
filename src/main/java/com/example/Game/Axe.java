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
        System.out.println("Axe");
    }
    @Override                   // 32
    public int getDamage(){
        System.out.println(70);
    }

    @Override
    public void attack(){
        System.out.println("Axe attack with damage - " + damage + " !");
    }
}
