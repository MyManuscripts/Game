package com.example.Game;

public interface  WeaponHolder {  // кто может держать оружие 37
    void takeWeapon(Weapon weapon); // взять оружие 38 // функция взять оружие (в которую передаем оружие)
    Weapon getWeapon(); // получить оружие 39  это геттер, который возвращает ссылку на текущее оружие персонажа.
    // Он не выполняет действия, а просто даёт доступ к объекту.
    boolean hasWeapon(); // наличие оружия 40
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


