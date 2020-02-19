package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskSix {

	public static void main(String[] args) {

		// Дана последовательность N вещественных чисел. Вычислить сумму чисел,
		// порядковые номера которых являются простыми числами

		int n;
		double[] arr;
		int num;
		double sum;

		n = 5;
		sum = 0;

		arr = createArray(n);
		
		System.out.println("Task 6. Array: ");		
		viewArray(arr);
		System.out.println("");
		
		
		for (int i = 2; i < arr.length; i++) {
			num = 0;
			for (int j = i - 1; j > 1; j--) {
				if (i % j == 0) {
					num = num + 1;
				}
			}
			if (num == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.printf("Sum = " + "%-10.3f", sum);

	}

	private static double[] createArray(int n) {

		Random rand;

		double[] arr = new double[n];
		rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() + rand.nextInt(100);
		}
		return arr;
	}

	private static void viewArray(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[" + i + "] = " + "%-10.3f ", arr[i]);
		}
	}

}
