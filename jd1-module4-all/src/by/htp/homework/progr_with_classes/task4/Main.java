package by.htp.homework.progr_with_classes.task4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Создайте класс Train, содержащий поля название пункта назначения, номер
		// поезда, время отправления. Создайте данные в массив из пяти элементов типа
		// Train, дабавьте возможность сортировки элементов массива по номерам поездов,
		// добавьте возможность вывода информации о поезде, номер которого введен
		// пользователем. Добавьте возможность сортировки массива по пункту назначения,
		// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по
		// времени отправления.

		int numTrain; // Для номера поезда, который вводит пользователь
		Helper help = new Helper(); // Класс для создания массива
		View view = new View();
		Train[] trainSchedule = help.createTrainSchedule();

		view.printOne(trainSchedule); // Вывод оригинального массива поездов

		// Три строки для вывода данных о поезде, по введенному пользователем номеру

		InsertNumOfTrain insert = new InsertNumOfTrain();
		numTrain = insert.insertNumOfTrain(trainSchedule);
		view.printOneTrain(numTrain, trainSchedule);

		// Сортировка по номеру поезда

		Arrays.sort(trainSchedule);
		view.printTwo(trainSchedule);

		// Сортировка по пункту назначения и времени отправления

		Arrays.sort(trainSchedule, new TrainSortDestinishionAndTime());
		view.printThree(trainSchedule);
	}

}
