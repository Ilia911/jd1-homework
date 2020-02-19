package by.htp.homework.basic;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LoopTaskEight {

	public static void main(String[] args) {

		// Даны 2 числа. Определить цифры, входящие в запись как одного, так и другого
		// числа

		double figure;
		double figure2;
		char[] base;
		String figureStr;
		String figureStr2;
		String result;
		String b;

		figure = -.456;
		figure2 = 123.4056;

		base = new char[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		result = "";

		figureStr = " " + figure;
		figureStr2 = " " + figure2;

		for (int i = 0; i < 10; i++) {
			b = "" + (int) base[i];

			if (figureStr.indexOf(b) > 0 && figureStr2.indexOf(b) > 0) {
				result = result + (int) base[i] + "; ";
			}

		}
		System.out.println(result);
	}

}
