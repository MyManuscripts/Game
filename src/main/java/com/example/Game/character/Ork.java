package com.example.Game.character;

import com.example.Game.weapon.Axe;

public class Ork extends GameCharacter { // 9
    public Ork(){
        super("Ork",100,90, "super kick");
        // создаем оружие   25
       /* Weapon axe = new Weapon("axeFire",70);

        // вручаем оружие   26 -> теперь weapon делаем интерфейсом
        takeWeapon(axe);*/

        // Орк берет оружие
        takeWeapon(new Axe("Axe", 75));

    }
}

