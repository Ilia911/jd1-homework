package by.htp.homework.basic_of_oop.task4.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import by.htp.homework.basic_of_oop.bean.MagicTreasureProtection;
import by.htp.homework.basic_of_oop.bean.MagicTreasureWeapon;
import by.htp.homework.basic_of_oop.bean.SimpleTreasure;
import by.htp.homework.basic_of_oop.bean.Treasure;
import by.htp.homework.basic_of_oop.bean.TreasureOfTheDragon;

public class TreasureDAO {
	// При помощи этого класса мы заполним сокровищницу дракона (считаем данные из
	// файла)

	public TreasureDAO() {
	}

	@SuppressWarnings("resource")
	public TreasureOfTheDragon createTreasury(String name) throws FileNotFoundException {

		TreasureOfTheDragon treasury;
		Scanner scan = null;
		Treasure treasure;

		treasury = new TreasureOfTheDragon(name);

		scan = new Scanner(new FileReader("treasury.txt"));

		for (int i = 0; i < 30; i++) {

			treasure = new MagicTreasureWeapon();

			treasure.setPrice(scan.nextInt());
			treasure.setQuality(scan.nextInt());
			treasure.setMagicPower(scan.nextInt());

			treasury.add(treasure);
		}

		for (int i = 0; i < 30; i++) {

			treasure = new MagicTreasureProtection();

			treasure.setPrice(scan.nextInt());
			treasure.setQuality(scan.nextInt());
			treasure.setMagicPower(scan.nextInt());

			treasury.add(treasure);
		}

		for (int i = 0; i < 40; i++) {

			treasure = new SimpleTreasure();

			treasure.setPrice(scan.nextInt());
			treasure.setQuality(scan.nextInt());

			treasury.add(treasure);
		}

		return treasury;
	}

}
