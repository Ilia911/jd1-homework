package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskEight {

	public static void main(String[] args) {

		// Дана последовательность целых чисел.
		// Образовать новую последовательность без члена с минимальным значением из
		// предыдущей последовательности

		int[] arr;
		int[] arrNew;
		int n;
		

		n = 10;
		arr = createArray(n);
		System.out.println("Task eight. Array: ");
		viewArray(arr);
		arrNew = createArrayNew(arr);
		System.out.println("");
		System.out.println("New array: ");
		viewArray(arrNew);

	}

	private static int[] createArray(int n) {
		Random rand = new Random();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) - 5;
		}
		return arr;
	}

	private static int[] createArrayNew(int[] arr) {

		int min;
		int[] arrNew;
		int k;
		int num;

		num = 0;
		k = 0;
		min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (min == arr[i]) {
				k = k + 1;
			}
		}

		arrNew = new int[(arr.length - k)];

		for (int i = 0; i < arr.length; i++) {
			if (min != arr[i]) {
				arrNew[num] = arr[i];
				num = num + 1;
			}
		}
		return arrNew;
	}

	private static void viewArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] =  " + arr[i] + "; ");
		}
	}

}
