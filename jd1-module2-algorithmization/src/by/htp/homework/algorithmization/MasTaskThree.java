package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskThree {

	public static void main(String[] args) {

		// Дана матрица. Вывести k-ую строку и р-ый столбец матрицы

		int[][] mas;
		int n;
		int m;
		int k;
		int p;

		n = 4; // mas size
		m = 5; // mas size
		k = 2;
		p = 3;

		mas = createMas(n, m);
		System.out.println("Task three. Original array:");
		viewMas(mas);
		System.out.println("Result string:");
		viewMasString(mas, k);
		System.out.println("Result column:");
		viewMasColumn(mas, p);

	}

	private static int[][] createMas(int n, int m) {
		int[][] mas;
		Random rand;
		mas = new int[n][m];
		rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100) - 50;
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

	private static void viewMasString(int[][] mas, int k) {

		for (int i = k;;) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("mas[%d][%d] = %-4d ", i, j, mas[i][j]);
			}
			System.out.println("");
			break;
		}

	}

	private static void viewMasColumn(int[][] mas, int p) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = p;;) {
				System.out.printf("mas[%d][%d] = %-4d ", i, j, mas[i][j]);
				break;
			}
			System.out.println("");
		}
	}

}
