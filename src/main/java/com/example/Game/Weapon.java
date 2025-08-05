package com.example.Game;

public class Weapon {       // 16
    private String name; // название
    private int damage; // урон

    // конструктор
    public Weapon(String name, int damage){     // 17
        this.name = name;
        this.damage = damage;

    }
    // геттеры
    public String getName() {
        return name;
    }       // 18

    public int getDamage() {
        return damage;
    }          // 19
    // вывод информации
    public void weaponInfo(){                       // 20 -> GameCharacter
        System.out.println("weapon name: " + name);
        System.out.println("weapon damage: " + damage);
    }
    // теперь обновим класс GameCharacter
}
