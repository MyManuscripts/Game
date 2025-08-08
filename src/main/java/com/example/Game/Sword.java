package com.example.Game;

public class Sword implements Weapon{ // 33
    @Override                   // 34
    public void install() {
        System.out.println("Sword install");
    }
    @Override                   // 35
    public void fire(){
        System.out.println("Sword attack!");
    }
}

