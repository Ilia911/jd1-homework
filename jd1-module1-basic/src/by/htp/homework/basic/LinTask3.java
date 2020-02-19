package by.htp.homework.basic;

import static java.lang.Math.*;

public class LinTask3 {

	public static void main(String[] args) {

		// Найдите значение функции

		double x;
		double y;
		double result;

		x = 2.5;
		y = 3.4;

		result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

		System.out.println("Task three. Result = " + result);

	}

}
