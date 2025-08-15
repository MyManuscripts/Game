package com.example.Game;

public class Elf extends GameCharacter{
    Elf(){
        super("Elf",100,75,"Invisible");

        takeWeapon(new Crossbow("Crossbow", 75));
    }
}
