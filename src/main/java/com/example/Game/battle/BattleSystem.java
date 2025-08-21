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

        if ( weapon == null ){ // если у персонажа нет оружия
            System.out.println(attacker_1.getRace() + " hasn't weapon and punch with 5 damage ");
            attacker_2.takeDamage(5);
            return; // это выход из метода
        }

        int baseDamage = weapon.getDamage();
        int strengthBonus = attacker_1.getStrength() / 2;   // Эта строка вычисляет бонус к урону от силы персонажа **
        int totalDamage = baseDamage + strengthBonus;

        System.out.println(attacker_1.getRace() + " attack with " + weapon.getName() + " !");
        weapon.attack();
        System.out.println("Doing " + totalDamage + " % damage.");

        attacker_2.takeDamage(totalDamage);
    }
}

// ** Потому что:
//Мы не хотим, чтобы сила слишком сильно влияла на урон.
//Иначе сильный персонаж будет наносить слишком много урона, и игра станет несбалансированной

/* Например: У персонажа сила = 90
        Оружие наносит 70 урона
        Если добавить всю силу: 70 + 90 = 160 → слишком много
        Если добавить половину: 70 + 45 = 115 → разумно */
