package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskFour {

	public static void main(String[] args) {

		// Даны дейстиетльные числа. Поменять местами наименьший и наибольший элемент

		int n;
		double max;
		double min;
		double[] arr;

		n = 20;
		// arr = new double[] {1,3,5,-4,0,8,-1,0};
		arr = createArray(n);

		max = arr[0];
		min = arr[0];

		System.out.println("Task four. Start array:");
		viewArray(arr);

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				arr[i] = min;
			} else if (arr[i] == min) {
				arr[i] = max;
			}
		}

		System.out.println("Finish array:");
		viewArray(arr);

	}

	private static double[] createArray(int n) {
		double[] arr = new double[n];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() + rand.nextInt(100) - 50;
		}
		return arr;
	}

	private static void viewArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%10.3f ", arr[i]);
		}
		System.out.println("");
	}

}
