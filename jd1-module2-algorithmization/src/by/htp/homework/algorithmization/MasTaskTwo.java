package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskTwo {

	public static void main(String[] args) {

		// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

		int n;
		int[][] mas;

		n = 5;

		mas = createMas(n, n);
		viewMas(mas);
		System.out.println("");
		System.out.println("Result Mas");
		viewMasRes(mas);

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

	private static void viewMasRes(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {				
				if (i == (mas[i].length - j - 1)) {
					System.out.printf("mas[%d][%d] = %-4d ", i, j, mas[i][j]);
				}				
			}
			System.out.println("");
		}
	}

}
