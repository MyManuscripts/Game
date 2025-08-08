package com.example.Game;

public class Sword implements Weapon{ // 3

    private String name;
    private int damage;

    public Sword(String name, int damage){
        this.name = name;
        this.damage = damage;
    }


    @Override                   // 34
    public void install() {
        System.out.println("Sword install");
    }
    @Override                   // 35
    public void fire(){
        System.out.println("Sword attack!");
    }
}

