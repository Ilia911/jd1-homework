package by.htp.homework.oop.task5.service;

import by.htp.homework.oop.task5.bean.Pack;
import by.htp.homework.oop.task5.bean.PackType;
import by.htp.homework.oop.task5.bean.Rose;
import by.htp.homework.oop.task5.bean.Tulip;
import by.htp.homework.oop.task5.service.util.Validator;

public class ServiceProvider {

	private static ServiceProvider instance = new ServiceProvider();

	private ServiceProvider() {
	}

	public FlowerService createFlower(String name, int price) throws ServiceException {

		if (!Validator.isFlowerInputValid(name, price)) {
			throw new ServiceException("Incorrect input!");
		}
		switch (name) {
		case "rose": {
			return new Rose(name, price);
		}
		case "tulip": {
			return new Tulip(name, price);
		}
		}
		return null;
	}

	public Pack createPack(PackType type, int price) throws ServiceException {

		if (!Validator.isPackInputValid(type, price)) {
			throw new ServiceException("Incorrect input!");
		}
		return new Pack(type, price);
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

}
