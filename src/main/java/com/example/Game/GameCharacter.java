package com.example.Game;

public class GameCharacter implements WeaponHolder{
    private String race; // раса 2
    private int health; // здоровье 3
    private int strength; // сила 4
    private String ability; // способность 5
    private Weapon weapon; // оружие персонажа 21


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
    public String getAbility() {return ability; }


    /*public void takeWeapon(Weapon weapon){ // установка оружия 22
        this.weapon = weapon;
    }

    public Weapon getWeapon(){ // получение информации об оружии 23
        return weapon;
    }*/                            // 36

    // реализуем интерфейс WeaponHolder
    @Override
    public void takeWeapon(Weapon weapon){
        System.out.println(race + " взял оружие");
    }

    @Override
    public Weapon getWeapon(){
        return weapon;
    }

    @Override
    public boolean hasWeapon(){
        return weapon != null;
    }



    // пишем метод для вывода информации о персонаже 8
    public void printInfo(){
        System.out.println("раса: " + race);
        System.out.println("здороовье: " + health);
        System.out.println("сила: " + strength);
        System.out.println("способность: " + ability);

        // добавляем информацию о вооружении 24 -> Ork
       /* if (getWeapon()!= null){
        System.out.println("оружие: " + weapon.getName() + " урон: " + weapon.getDamage());
        }else {
            System.out.println("оружие отсутствует");
        }*/
    }

}
