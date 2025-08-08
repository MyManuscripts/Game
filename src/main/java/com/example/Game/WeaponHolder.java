package com.example.Game;

public interface  WeaponHolder {  // кто может держать оружие 37
    void takeWeapon(Weapon weapon);
    Weapon getWeapon();
    boolean hasWeapon();
}

    /*private Weapon currentWeapon; // создаем экземпляр интерфейса

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
    }*/


