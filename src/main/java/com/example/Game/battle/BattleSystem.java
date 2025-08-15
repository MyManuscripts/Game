package com.example.Game.battle;

import com.example.Game.character.GameCharacter;
import com.example.Game.character.Ork;

public class BattleSystem {
    public void Fight (GameCharacter character_1, GameCharacter character_2) {
        System.out.println("The fight begins! " + character_1.getRace() + " vs " + character_2.getRace());

        int round = 1;
        while (character_1.getHealth()>0 && character_2.getHealth()>0){


        }
    }

    public void attack(){

    }
}
