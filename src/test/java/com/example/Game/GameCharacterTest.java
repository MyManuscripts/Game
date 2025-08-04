package com.example.Game;

import com.example.Game.GameCharacter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GameCharacterTest {           // 12
    private GameCharacter character;        // 13

    @Before                                 // 14
    public void setUp() {
        character = new GameCharacter("ork", 100, 90, "super kick");
    }

    /*
    В данном случае вы проверяете, что результат метода getRace() у объекта character равен строке "ork".
    Это важно, так как вы ожидаете, что созданный персонаж должен быть орком.*/

    @Test // JUnit будет искать все методы, помеченные этой аннотацией, и запускать их во время выполнения тестов.
    public void testCreateCharacter() {         // 15
        assertEquals("ork", character.getRace());  // Измените на ожидаемое значение
        assertEquals(100, character.getHealth());
        assertEquals(90, character.getStrength());  // Измените на ожидаемое значение
        assertEquals("super kick", character.getAbility());  // Измените на ожидаемое значение
    }
}   //  - assertEquals — это статический метод из класса org.junit.Assert, который сравнивает два значения.
    //   Если они равны, тест проходит успешно.

    // - В данном случае вы проверяете, что результат метода getRace() у объекта character равен строке "ork".
//      Это важно, так как вы ожидаете, что созданный персонаж должен быть орком

    /*. assertEquals(100, character.getHealth());:
   - Здесь вы проверяете значение здоровья персонажа, вызвав метод getHealth(). Вы ожидаете, что здоровье
     будет равно 100, так как при создании персонажа вы задали это значение в конструкторе.

4. assertEquals(90, character.getStrength());:
   - Эта строка аналогична предыдущей, но для проверки силы персонажа. Вы ожидаете, что сила равна 90.

5. assertEquals("super kick", character.getAbility());:
   - Здесь вы проверяете способность персонажа. Ожидается, что метод getAbility() вернет строку "super kick",
     которую вы также задали при создании персонажа.*/

/*Когда вы запускаете тесты, JUnit вызывает метод testCreateCharacter().

1. Создание экземпляра: В методе setUp(), который выполняется перед запуском каждого теста, создается экземпляр
   GameCharacter с заданными параметрами.

2. Проверка значений: Затем, внутри testCreateCharacter(), каждое из значений проверяется с помощью assertEquals().
   Если все проверки проходят успешно, тест считается успешным. Если хотя бы одно значение не совпадает с ожидаемым,
   тест провалится, и вы получите отчет с информацией о том, какое именно тестирование не произошло успешно.*/