package by.htp.homework.oop.task5.service.util;

import by.htp.homework.oop.task5.bean.PackType;

public class Validator {

	public static boolean isFlowerInputValid(String name, int price) {

		if (("rose".equals(name) || "tulip".equals(name)) && price > 0) {
			return true;
		}

		return false;
	}

	public static boolean isPackInputValid(PackType type, int price) {

		if (price > 0 && (PackType.PAPER == type || PackType.PLASTIC == type)) {
			return true;
		}
		return false;
	}

}
