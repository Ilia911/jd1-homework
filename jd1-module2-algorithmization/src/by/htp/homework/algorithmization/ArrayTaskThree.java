package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskThree {

	public static void main(String[] args) {

		// Дан массив действительных чисел, размерность которого N
		// Подсчитать количество положительных и отрицательных чисел,
		// чисел, равных нулю

		int n;
		int nul = 0;
		int pos = 0;
		int neg = 0;
		double[] arr;

		n = 20;
		// arr = new double[] {1,3,5,-4,0,8,-1,0};
		arr = createArray(n);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos = pos + 1;
			} else if (arr[i] < 0) {
				neg = neg + 1;
			} else
				nul = nul + 1;
		}

		System.out.println("Task three. Array:");
		viewArray(arr);
		System.out.println("Result:");
		System.out.println("Positive = " + pos);
		System.out.println("Negative = " + neg);
		System.out.println("Null = " + nul);
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
