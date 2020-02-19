package by.htp.homework.algorithmization;

import java.util.Random;

public class SortTaskFour {

	public static void main(String[] args) {

		// Сортировка обменами
		// Дана последовательность чисел а[1] <= a[2] <= ... <= a[n]
		// Требуется поставить числа в порядке возрастания
		// Для этого сравниваются два соседних числа a[i] и a[i+1].
		// Если a[i] > a[i+1], то делается перестановка
		// Также подсчитать количество перестановок

		double[] arr;
		int n;
		Random rand;
		int num;

		rand = new Random();

		n = rand.nextInt(10) + 2;
		arr = createArr(n);

		System.out.println("Task four.");
		System.out.println("Array:");
		viewArr(arr);
		num = arrayChanging(arr);
		System.out.println("Chenged array:");
		viewArr(arr);
		System.out.println("Num of the changing = " + num);
	}

	private static double[] createArr(int n) {
		double[] arr = new double[n];
		Random rand = new Random();

		arr[0] = rand.nextDouble() + rand.nextInt(10) - 2;

		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + rand.nextInt(2);
		}
		return arr;
	}

	private static int arrayChanging(double[] arr) {

		double temp;
		int k;

		k = 0;

		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					k = k + 1;
				}

			}
		}
		return k;
	}

	private static void viewArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%2d] = %-8.3f ", i, arr[i]);

		}
		System.out.println("");
	}

}
