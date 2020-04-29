package by.htp.homework.basic_of_oop.main;

import java.io.FileNotFoundException;

import by.htp.homework.basic_of_oop.bean.TreasureOfTheDragon;
import by.htp.homework.basic_of_oop.logic.TreasureOfTheDragonLogic;
import by.htp.homework.basic_of_oop.print_console.View;
import by.htp.homework.basic_of_oop.task4.dao.TreasureDAO;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		// Создать консольное приложение, удовлетворяющее следующим условиям:

		/*
		 * - приложение должно быть объектноориентированным; - каждый класс должен иметь
		 * отражающее смысл название и информативный состав; - наследование должно
		 * применяться только тогда, когда это имеет смысл; - при кодировании должны
		 * использоваться соглашения согласно code convention; - классы должны быть
		 * грамотно разложенны по пакетам; - консольное меню должно быть минимальным; -
		 * для хранения данных можно использовать файлы.
		 */

		/*
		 * Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
		 * 100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
		 * выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
		 * сумму.
		 */

		TreasureOfTheDragon treasureOfTheDarkDragon; // Все сокровища хранятся здесь
		TreasureDAO help; // Для заполнения сокровищницы (считываем данные из файла)
		View view; // Для вывода в консоль дынных
		TreasureOfTheDragonLogic treasuryLogic;
		TreasureOfTheDragon treasuryWithMaxPrice;
		TreasureOfTheDragon treasurySelectedBySum;

		view = new View();
		help = new TreasureDAO();
		treasuryLogic = new TreasureOfTheDragonLogic();

		treasureOfTheDarkDragon = help.createTreasury("Dark Dragon's treasury");

		view.printTreasury(treasureOfTheDarkDragon);

		treasuryWithMaxPrice = treasuryLogic.findMaxPriceTreasure(treasureOfTheDarkDragon);

		view.printMaxPriceTreasure(treasuryWithMaxPrice);

		// Здесь в качестве второго параметра ввести сумму, на которую нужно выбрать сокровища
		treasurySelectedBySum = treasuryLogic.treasureSelectionBySum(treasureOfTheDarkDragon, 2500);

		view.printSelectedTreasury(treasurySelectedBySum);
	}

}
