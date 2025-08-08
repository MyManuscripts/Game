package com.example.Game;

public class WeaponManager {  // класс, который будет управлять выбором и установкой оружия 37
    private Weapon currentWeapon; // создаем экземпляр интерфейса

    // Пишем метод для установки оружия

    public void equipWeapon(Weapon weapon){
        currentWeapon = weapon;
        currentWeapon.install();
    }

    public void useWeapon(){  // использовнаие оружия персонажем
        if (currentWeapon != null){ // если оружие утснаовллено
            currentWeapon.attack(); // огонь!
        }else {
            System.out.println("haven't weapon");
        }
    }

}
