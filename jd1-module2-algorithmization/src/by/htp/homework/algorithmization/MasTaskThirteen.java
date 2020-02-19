package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskThirteen {

	public static void main(String[] args) {

		// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов

		int[][] mas;
		int n;
		Random rand;

		rand = new Random();

		System.out.println("Task thirteen.");

		n = rand.nextInt(4) + 3;
		mas = createMas(n, n);
		System.out.println("Original matrix:");
		viewMas(mas);
		sortingSelectionUp(mas);
		System.out.println("Sorted matrix Up:");
		viewMas(mas);
		System.out.println("Sorted matrix Down:");
		sortingSelectionDown(mas);
		viewMas(mas);
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

	private static void sortingSelectionUp(int[][] mas) {

		// Сортировка методом прямого выбора

		int min;
		int indexMin;

		for (int k = 0; k < mas.length; k++) { // Счетчик для столбцов

			for (int i = 0; i < mas.length - 1; i++) {
				min = mas[i][k];
				indexMin = i;

				for (int j = i + 1; j < mas.length; j++) {

					if (min > mas[j][k]) {
						min = mas[j][k];
						indexMin = j;
					}
				}
				mas[indexMin][k] = mas[i][k];
				mas[i][k] = min;
			}
		}
	}

	private static void sortingSelectionDown(int[][] mas) {

		// Сортировка методом прямого выбора

		int max;
		int indexMin;

		for (int k = 0; k < mas.length; k++) { // Счетчик для столбцов

			for (int i = 0; i < mas.length - 1; i++) {
				max = mas[i][k];
				indexMin = i;

				for (int j = i + 1; j < mas.length; j++) {

					if (max < mas[j][k]) {
						max = mas[j][k];
						indexMin = j;
					}
				}
				mas[indexMin][k] = mas[i][k];
				mas[i][k] = max;
			}
		}
	}
}
