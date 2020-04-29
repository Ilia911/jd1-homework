package by.htp.homework.oop.task5.main;

import by.htp.homework.oop.task5.bean.FlowerComposition;
import by.htp.homework.oop.task5.bean.Pack;
import by.htp.homework.oop.task5.bean.PackType;
import by.htp.homework.oop.task5.bean.Rose;
import by.htp.homework.oop.task5.service.FlowerCompositionService;
import by.htp.homework.oop.task5.service.FlowerService;
import by.htp.homework.oop.task5.service.ServiceException;
import by.htp.homework.oop.task5.service.ServiceProvider;
import by.htp.homework.oop.task5.service.impl.FlowerCompositionServiceImpl;
import by.htp.homework.oop.task5.view.View;

public class Main {

	public static void main(String[] args) throws ServiceException {

		/*
		 * Создать консольное приложение, удовлетворяющее следующим требованиям:
		 * Корректно спроектировать и реализовать предметную область задачи. Для
		 * создания объектов из иерархии классов продумать возможность использования
		 * порождающих шаблонов проектирования. Реализовать проверку данных, вводимых
		 * пользователем, но не на стороне клиента. для проверки корректности переданных
		 * данных можно применять регулярные выражения. Меню выбора действия
		 * пользователем можно не реализовывать, используйте заглушку. Особое условие:
		 * переопределить, где необходимо, метды toString(), equals(), hashCode().
		 */

		// Вариант А. Цветочная композиция
		// Реализовать приложение, повзоляющее создавать цветочные композиции (объект,
		// представляющий собой цветочную композицию). Составляющими цветочной
		// композиции являются цветы и упаковка

		FlowerComposition flowerComposition = new FlowerComposition();

		flowerComposition.add(ServiceProvider.getInstance().createFlower("rose", 15));
		flowerComposition.add(ServiceProvider.getInstance().createFlower("tulip", 5));
		flowerComposition.setPack(ServiceProvider.getInstance().createPack(PackType.PAPER, 5));

		FlowerCompositionService flowerCompositionService = new FlowerCompositionServiceImpl();
		flowerComposition.setSum(flowerCompositionService.sum(flowerComposition));

		View.printFlowerComposition(flowerComposition);
	}

}
