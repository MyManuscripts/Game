package com.example.Game.launcher;

import com.example.Game.battle.BattleSystem;
import com.example.Game.character.Elf;
import com.example.Game.character.Ork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {

		// SpringApplication.run(GameApplication.class, args);

		Ork ork = new Ork();
		Elf elf = new Elf();

		System.out.println("info: ");
		ork.printInfo();
		System.out.println();
		elf.printInfo();
		System.out.println();

		BattleSystem battleSystem = new BattleSystem(); // start battle


	}

}
