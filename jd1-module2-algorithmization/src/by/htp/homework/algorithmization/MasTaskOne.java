package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskOne {

	public static void main(String[] args) {

		// Дана матрица. Вывести все нечетные столбцы, у которых первый элемент больше
		// последнего

		int n;
		int m;
		int[][] mas;

		n = 3;
		m = 10;

		mas = createMas(n, m);
		viewMas(mas);
		System.out.println("");
		System.out.println("Result Mas");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 1; j < mas[i].length; j = j + 2) {
				if (mas[0][j] > mas[(mas.length - 1)][j]) {
					System.out.printf("mas[%d][%d] = %-4d ", i, j, mas[i][j]);
				}
			}
			System.out.println("");
		}
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
}
