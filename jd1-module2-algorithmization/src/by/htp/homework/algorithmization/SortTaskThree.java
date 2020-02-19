package by.htp.homework.algorithmization;

import java.util.Random;

public class SortTaskThree {

	public static void main(String[] args) {

		// Сортировка выбором
		// Дана последовательность чисел а[1] <= a[2] <= ... <= a[n]
		// Требуется переставить элементы чтобы они были расположены по убыванию
		// Для этого в массиве, начиная с первого, выбирается наибольший элемент и
		// ставится на первое место, а первый - на место наибольшего. Затем процедура
		// повторяется начиная со второго элемента. И т.д.

		double[] arr;
		int n;
		Random rand;

		rand = new Random();

		n = rand.nextInt(10) + 2;
		arr = createArr(n);

		System.out.println("Task three.");
		System.out.println("Array:");
		viewArr(arr);
		arrayChanging(arr);
		System.out.println("Chenged array:");
		viewArr(arr);
	}

	private static double[] createArr(int n) {
		double[] arr = new double[n];
		Random rand = new Random();

		arr[0] = rand.nextDouble() + rand.nextInt(10) - 2;

		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + rand.nextInt(5) + 1;
		}
		return arr;
	}

	private static void arrayChanging(double[] arr) {

		double max;
		int k;

		for (int j = 0; j < arr.length; j++) {
			max = arr[j];
			k = 0;

			for (int i = j + 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
					k = i;
				}
				arr[k] = arr[j];
				arr[j] = max;

			}
		}

	}

	private static void viewArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%2d] = %-8.3f ", i, arr[i]);

		}
		System.out.println("");
	}

}
