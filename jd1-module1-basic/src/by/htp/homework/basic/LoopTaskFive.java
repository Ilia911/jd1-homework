package by.htp.homework.basic;

public class LoopTaskFive {

	public static void main(String[] args) {

		// Дан числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
		// которых больше либо равен заданному е
		// считаем что числовой ряд начинается с единицы

		double result = 0;
		double n = 1;
		double e = 0.1;
		double num;

		num = 1.0 / 2 + 1.0 / 3;

		while (num > e) {
			result = result + num;
			n = n + 1;
			num = 1 / Math.pow(2.0, n) + 1 / Math.pow(3.0, n);
		}
		System.out.println("Task five. Result = " + result);
	}

}
