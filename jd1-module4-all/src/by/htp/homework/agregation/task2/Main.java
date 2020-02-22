package by.htp.homework.agregation.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы
		// ехать, заправляться, менять колесо. Вывести на консоль марку автомобиля.

		List<Wheel> winterWheelSet = new ArrayList<Wheel>();
		winterWheelSet.add(new Wheel("belshina", "15W", 90));
		winterWheelSet.add(new Wheel("belshina", "15W", 90));
		winterWheelSet.add(new Wheel("belshina", "15W", 90));
		winterWheelSet.add(new Wheel("belshina", "15W", 90));
		
		Engine newEngine = new Engine("Renault", "123WQZ", 2800);
		
		Car myCar = new Car("Renault", newEngine, winterWheelSet, 60);
		
		View view = new View();
		view.printResult(myCar);
		
		myCar.refuel(35);
		myCar.move(450);
		
		Wheel spareWheel = new Wheel("Atlant", "15WS", 120);
		
		CarLogic carLogic = new CarLogic();
		carLogic.wheelReplace(myCar, 2, spareWheel);
		
		view.printResult(myCar);
	}

}
