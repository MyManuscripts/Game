package com.example.Game;

import com.example.Game.character.Ork;
import com.example.Game.weapon.Sword;

public class Main {                        // 10
    public static void main(String[] args) {
        Ork ork = new Ork();                 // 11
        ork.printInfo();
        System.out.println("---"); // разделитель информации

        ork.attack(); // орк атакует с текущим оружием

        ork.takeWeapon(new Sword("Sword4Natural",80)); // орк берет меч 4х стихий
        ork.attack(); // орк атакует

        ork.takeWeapon(null); // орк убирает оружие
    }
}
