package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskTwo {

	public static void main(String[] args) {

		// Дана последовательность действительных чисел.
		// Заменить все ее члены большие данного числа Z на число Z
		// Подсчиталь количество замен

		int count;
		double[] arr;
		int n;
		double z;

		n = 20;
		z = 50;
		count = 0;
		arr = createArray(n);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				count = count + 1;
			}
		}

		System.out.println("Task two. Result array: ");
		viewArray(arr);
		System.out.println("");
		System.out.println("Chenged values quantity: " + count);

	}

	private static double[] createArray(int n) {
		Random rand;
		rand = new Random();
		double[] arr = new double[n];

		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextDouble() + rand.nextInt(100);
		}
		return arr;
	}

	private static void viewArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%-10.3f ", arr[i]);
		}
	}

}
