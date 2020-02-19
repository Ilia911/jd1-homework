package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskFifteen {

	public static void main(String[] args) {

		// Найти наибольший элемент в матрице и заменить все нечетные элементы на него

		int[][] mas;
		int n;
		int m;
		Random rand;
		rand = new Random();
		int max;

		System.out.println("Task fifteen.");

		n = rand.nextInt(10);
		m = rand.nextInt(10);

		mas = createMas(n, m);
		System.out.println("Original array:");
		viewMas(mas);
		max = findMax(mas);
		System.out.println("Max item = " + max);
		changeMas(mas, max);
		System.out.println("Chenged array:");
		viewMas(mas);

	}

	private static int[][] createMas(int n, int m) {
		Random rand;
		int[][] mas;
		mas = new int[n][m];
		rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(15);
			}
		}
		return mas;
	}

	private static void viewMas(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("mas[%2d][%2d] = %-4d ", i, j, mas[i][j]);
			}
			System.out.println("");
		}
	}

	private static int findMax(int[][] mas) {
		int max;
		max = mas[0][0];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
		}
		return max;
	}

	private static void changeMas(int[][] mas, int max) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				if (mas[i][j] % 2 != 0) {
					mas[i][j] = max;
				}
			}
		}
	}

}
