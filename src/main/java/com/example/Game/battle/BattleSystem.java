package com.example.Game.battle;

import com.example.Game.character.GameCharacter;
import com.example.Game.character.Ork;
import com.example.Game.weapon.Weapon;

public class BattleSystem {
    public void fight (GameCharacter character_1, GameCharacter character_2) {
        System.out.println("The fight begins! " + character_1.getRace() + " vs " + character_2.getRace());

        int round = 1;


        /*while (character_1.getHealth()>0 && character_2.getHealth()>0){
            System.out.println("round: " + round);

            attack (character_1, character_2); // атакует первый персонаж

            if (character_2.getHealth() <= 0){
                System.out.println(character_1 + " is win!");
                System.out.println(character_2.getRace() + " is dead");
            }

            attack (character_2, character_1); // атакует второй персонаж

            if (character_1.getHealth() <= 0){
                System.out.println(character_2 + " is win!");
                System.out.println(character_1.getRace() + " is dead");
            }
        }*/
    }

    public void attack(GameCharacter attacker_1, GameCharacter attacker_2){

        Weapon weapon = attacker_1.getWeapon(); // в weapon кладем персонажа с возможностью быть вооруженным

        if (weapon==null){ // если у персонажа нет оружия
            System.out.println(attacker_1.getRace() + " hasn't weapon and punch with 5 damage ");

        }

    }
}
