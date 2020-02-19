package by.htp.homework.algorithmization;

import java.util.Random;

public class DecompTaskFive {

	public static void main(String[] args) {

		// Составить программу, которая в массиве A(N) находит второе по величине число.
		// Вывести на экран число, которое меньше максимального, но больше всех
		// остальных элементов

		double[] arr;
		double max;
		int n;

		n = 6;

		arr = createArray(n);
		// viewArray(arr); // Первоначальный массив. Оставлено для проверки
		max = findSecondMax(arr);
		// viewArray(arr); // Отсортированный массив. Оставлено для проверки
		print(max);

	}

	private static double findSecondMax(double[] arr) {
		double secondMax;

		sortingArray(arr);
		secondMax = arr[arr.length - 2];

		return secondMax;
	}

	private static void sortingArray(double[] arr) {

		// Сортировка методом прямого выбора

		double min;
		int indexMin;

		for (int i = 0; i < arr.length - 1; i++) {
			min = arr[i];
			indexMin = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (min > arr[j]) {
					min = arr[j];
					indexMin = j;
				}
			}
			arr[indexMin] = arr[i];
			arr[i] = min;
		}
	}

	private static double[] createArray(int n) {
		double[] mas;
		Random rand;

		mas = new double[n];
		rand = new Random();

		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextDouble() + rand.nextInt(100) - 50;
		}
		return mas;
	}

	private static void print(double result) {
		System.out.println("Task five. Searched number:");
		System.out.printf("%-6.3f", result);
	}

	private static void viewArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%2d] = %-6.3f ", i, arr[i]);
		}
		System.out.println("");
	}
}
