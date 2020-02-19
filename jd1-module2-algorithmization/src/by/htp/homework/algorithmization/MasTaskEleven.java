package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskEleven {

	public static void main(String[] args) {

		// Матрицу 10х20 заполнить случайными цифрами от 0 до 15. Вывести на экран саму
		// матрицу и номера строк, в которых число 5 встречается 3 и более раз

		int[][] mas;
		int[] arr;
		int n;
		int m;
		
		System.out.println("Task eleven.");

		n = 10;
		m = 20;

		mas = createMas(n, m);
		System.out.println("Original array:");
		viewMas(mas);
		arr = findFive(mas);
		System.out.println("Quantity of the fives in the columns:");
		viewArray(arr);
		System.out.println("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 3) {
				System.out.println("The string contains three or more fives is " + i);
			}
		}

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
				System.out.printf("mas[%d][%d] = %-4d ", i, j, mas[i][j]);
			}
			System.out.println("");
		}
	}

	private static void viewArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("resFive[" + i + "] = " + arr[i] + " ");
		}
	}

	private static int[] findFive(int[][] mas) {
		int[] arr;
		arr = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				if (mas[i][j] == 5) {
					arr[i] = arr[i] + 1;
				}
			}
		}
		return arr;
	}

}
