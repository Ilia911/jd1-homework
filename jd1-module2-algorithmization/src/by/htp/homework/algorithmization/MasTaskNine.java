package by.htp.homework.algorithmization;

import java.util.Random;
import java.util.Scanner;

public class MasTaskNine {

	public static void main(String[] args) {

		// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
		// столбце. Определить какой столбец содержит максимальную сумму

		int[][] mas;
		int[] arr;
		int n;
		int m;
		int max;

		System.out.println("Task nine.");

		System.out.println("Insert string quantity! n = > ");
		System.out.println("Insert column quantity! m = > ");
		n = scan();
		m = scan();

		// n= 4;
		// m = 5;

		mas = createMas(n, m);
		System.out.println("Original array:");
		viewMas(mas);
		arr = sumColumn(mas);
		System.out.println("Sum of the columns:");
		viewArray(arr);
		max = arrMax(arr);
		System.out.println("");
		System.out.println("Max item = " + max);
	}

	private static int[][] createMas(int n, int m) {
		Random rand;
		int[][] mas;
		mas = new int[n][m];
		rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		return mas;
	}

	private static void viewMas(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("mas[%d][%d] = %-4d ", i, j, mas[i][j]);
			}
			System.out.println("");
		}
	}

	private static void viewArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("resCol[" + i + "] = " + arr[i] + " ");
		}
	}

	private static int[] sumColumn(int[][] mas) {
		int[] arr;
		arr = new int[mas[0].length];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				arr[j] = arr[j] + mas[i][j];
			}
		}
		return arr;
	}

	private static int arrMax(int[] arr) {
		int max;
		max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	private static int scan() {
		int result;
		Scanner scan;
		scan = new Scanner(System.in);

		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("False! Try again! > ");
		}
		result = scan.nextInt();
		return result;

	}

}
