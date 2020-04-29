package by.htp.homework.oop.task5.view;

import by.htp.homework.oop.task5.bean.FlowerComposition;
import by.htp.homework.oop.task5.service.FlowerService;

public class View {

	public static void printFlowerComposition(FlowerComposition fC) {
		System.out.println("Pack: " + fC.getPack().getType() + ", price = " + fC.getPack().getPrice());

		for (FlowerService flower : fC.getList()) {
			System.out.println("Flower: " + flower.getName() + ", price = " + flower.getPrice());
		}
		System.out.println("Sum = " + fC.getSum());

	}

}
