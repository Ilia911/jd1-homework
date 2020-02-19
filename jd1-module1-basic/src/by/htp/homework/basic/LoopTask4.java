package by.htp.homework.basic;

import java.math.BigInteger;

public class LoopTask4 {

	public static void main(String[] args) {

		// Найти произведение квадратов первых двухсот чисел
		// Т.к. 0 в квадрате - это ноль, то считаем для [1,200]

		long result;

		result = 1;

		for (int i = 1; i <= 200; i++) {
			result = (long) result * i * i;
			if (result < 0) {
				break;
			}
		}
		
		if (result < 0) {
			System.out.println("Превышена вместимость переменной result");
		} else {
			System.out.println("Task four. Result = " + result);
		}
	}
	/*
	 * Это решение было заблокированно тренером на ревью т.к. использованы классы,
	 * которые мы еще не знаем
	 * 
	 * 
	 * BigInteger result = new BigInteger("1"); BigInteger step = new
	 * BigInteger("1"); BigInteger num = new BigInteger("0"); BigInteger figureKv;
	 * 
	 * for (int i = 0; i < 200; i++) { num = num.add(step); figureKv =
	 * num.multiply(num); result = result.multiply(figureKv); }
	 * System.out.println("Task fout. Result = " + result);
	 */
}
