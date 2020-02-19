package by.htp.homework.algorithmization;

import java.util.Random;

public class SortTaskSeven {

	public static void main(String[] args) {

		// Даны 2 неубывающие последовательности.
		// Необходимо указать те места, на которые нужно вставлять элементы
		// последовательности 2 в последовательность 1 так, чтобы новая
		// последовательность оставалась возрастающей

		// т.е., как я понимаю, нужно соствать новую последовательность из
		// двух данных так, чтобы она тоже была возрастающей, и вывести №№
		// элементов последовательности 2

		double[] arrA;
		double[] arrB;
		int[] arrAB;
		int n;
		int m;
		Random rand;

		rand = new Random();

		n = rand.nextInt(10) + 2;
		m = rand.nextInt(10) + 2;

		arrA = createArr(n);
		arrB = createArr(m);
		arrAB = createArrRes(arrA, arrB);
		System.out.println("Task two.");
		System.out.println("Array one:");
		viewArr(arrA);
		System.out.println("Array two:");
		viewArr(arrB);
		System.out.println("Num result:");
		viewArr(arrAB);

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

	private static int[] createArrRes(double[] arr1, double[] arr2) {

		double[] arrRes = new double[arr1.length + arr2.length];
		int[] arrNum = new int[arr2.length];
		int i = 0;
		int j = 0;

		for (int k = 0; k < arrRes.length; k++) {

			if (i == arr1.length) {
				arrRes[k] = arr2[j];
				arrNum[j] = k;
				j = j + 1;

			} else if (j == arr2.length) {
				arrRes[k] = arr1[i];
				i = i + 1;
			} else if (arr1[i] < arr2[j]) {
				arrRes[k] = arr1[i];
				i = i + 1;
			} else {
				arrRes[k] = arr2[j];
				arrNum[j] = k;
				j = j + 1;
			}
		}
		return arrNum;
	}

	private static void viewArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%2d] = %-8.3f ", i, arr[i]);
		}
		System.out.println("");
	}

	private static void viewArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%2d] = %-2d ", i, arr[i]);
		}
		System.out.println("");
	}

}
