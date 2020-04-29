package by.htp.homework.basic_of_oop.logic;

import java.util.Collections;

import by.htp.homework.basic_of_oop.bean.Treasure;
import by.htp.homework.basic_of_oop.bean.TreasureOfTheDragon;

public class TreasureOfTheDragonLogic {

	public TreasureOfTheDragon findMaxPriceTreasure(TreasureOfTheDragon treasury) {
		int maxPrice;
		TreasureOfTheDragon result;

		result = new TreasureOfTheDragon();

		maxPrice = findMaxPrice(treasury);

		for (Treasure tr : treasury.getList()) {
			if (tr.getPrice() == maxPrice) {
				result.add(tr);
			}
		}
		return result;
	}

	private int findMaxPrice(TreasureOfTheDragon treasury) {
		int maxPrice;

		maxPrice = treasury.getList().get(0).getPrice();

		for (Treasure tr : treasury.getList()) {
			if (tr.getPrice() > maxPrice) {
				maxPrice = tr.getPrice();
			}
		}

		return maxPrice;
	}

	public TreasureOfTheDragon treasureSelectionBySum(TreasureOfTheDragon treasury, int sum) {
		// Предположим что цена является критерием ценности сокровища для нас
		// Так что список сокровищь будем составлять начиная с самого дорогого

		int currentSum;
		TreasureOfTheDragon result;

		result = new TreasureOfTheDragon();
		currentSum = 0;

		Collections.sort(treasury.getList());

		for (Treasure tr : treasury.getList()) {
			if ((sum - currentSum) >= tr.getPrice()) {
				result.add(tr);
				currentSum += tr.getPrice();
			}
		}

		return result;
	}

}
