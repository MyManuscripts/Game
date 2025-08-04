package com.example.Game;

public class GameCharacter {
    private String race; // раса 2
    private int health; // здоровье 3
    private int strength; // сила 4
    private String ability; // способность 5


    // создаем конструктор для передачи значений 6
    public GameCharacter(String race, int health, int strength, String ability){
        this.race = race;
        this.health = health;
        this.strength = strength;
        this.ability = ability;
    }


    // создаем геттеры для дальнейшей работы с приватными полями 7
    public String getRace() {
        return race;
    }
    public int getHealth(){
        return health;
    }
    public int getStrength(){
        return strength;
    }
    public String getAbility(){
        return ability;
    }

    // метод для установки оружия, но этот метод
    /*public void takeWeapon(Weapon weapon){
        this.weapon = weapon;
    }*/



    // пишем метод для вывода информации о персонаже 8
    public void printInfo(){
        System.out.println("раса: " + race);
        System.out.println("здороовье: " + health);
        System.out.println("сила: " + strength);
        System.out.println("способность: " + ability);
    }



}
