package by.htp.homework.algorithmization;

import java.util.Random;

public class DecompTaskSix {

	public static void main(String[] args) {

		// Написать методы, определяющие, являются ли данные три числа взаимопростыми

		int n;
		int[] arr;
		boolean result;

		n = 3; // Количество чисел
		arr = createArray(n);
		result = findResult(arr);
		print(arr, result);
	}

	private static boolean findResult(int[] arr) {
		boolean result;
		int nodArray;

		result = false;
		nodArray = findNodArray(arr);

		if (nodArray == 1) {
			result = true;
		}
		return result;
	}

	private static int findNodArray(int[] arr) {
		int nodArray;
		int min;
		int temp;

		min = findMinArray(arr);

		nodArray = 1;

		for (int k = min; k > 0; k--) {
			temp = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % k != 0) {
					temp = temp + 1;
				}

			}
			if (temp == 0) {
				nodArray = k;
				return nodArray;
			}
		}
		return nodArray;
	}

	private static int findMinArray(int[] arr) {
		int min;
		min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	private static int[] createArray(int n) {
		Random rand;
		rand = new Random();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(20) + 1;
		}
		return arr;
	}

	private static void print(int[] arr, boolean result) {
		System.out.println("Task six. For these figures:");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[" + "%1d" + "] = " + "%-2d  ", i, arr[i]);
		}
		System.out.println("");
		System.out.println("Are these figures mutually simple? " + result);
	}
}
