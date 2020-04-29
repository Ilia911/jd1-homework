package by.htp.homework.basic_of_oop.print_console;

import by.htp.homework.basic_of_oop.bean.TreasureOfTheDragon;

public class View {
	// Класс для вывода на консоль

	public void printTreasury(TreasureOfTheDragon treasury) {
		System.out.println("All items in the " + treasury.getName());

		print(treasury);
	}

	public void printMaxPriceTreasure(TreasureOfTheDragon treasury) {
		System.out.println("List of the treasure whith max price: ");

		print(treasury);

	}

	public void printSelectedTreasury(TreasureOfTheDragon treasury) {
		System.out.println("List of the treasure selected by sum: ");

		print(treasury);

	}

	private void print(TreasureOfTheDragon treasury) {

		for (int i = 0; i < treasury.getList().size(); i++) {
			System.out.println("N - " + i + " " + treasury.getList().get(i));
		}
		System.out.println("");
	}

}
