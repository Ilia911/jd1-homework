package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskOne {

	public static void main(String[] args) {

		// Массив из натуральных чисел. Найти сумму тех, что больше числа К

		int[] arr;
		int n;
		int k;
		int result;

		n = 20;
		k = 3;
		result = 0;
		
		arr = createArr(n);

		for (int i = 0; i < n; i++) {
			if (arr[i] % k == 0) {
				result = result + arr[i];
			}
		}
		System.out.println("Task 1. Result = " + result);
	}

	private static int[] createArr(int n) {
		int[] arr = new int[n];
		Random rand;
		rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(100);
		}
		return arr;
	}

}
