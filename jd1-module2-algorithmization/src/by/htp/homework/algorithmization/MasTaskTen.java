package by.htp.homework.algorithmization;

import java.util.Random;
import java.util.Scanner;

public class MasTaskTen {

	public static void main(String[] args) {

		// Найти положительные элементы главной диагонали квадратной матрицы

		int[][] mas;
		int[] arr;
		int n;

		System.out.println("Task ten.");
		System.out.println("Insert size a square matrix! > ");

		n = scan();
		mas = createMas(n, n);
		System.out.println("Original array:");
		viewMas(mas);
		arr = mainDiagonal(mas);
		System.out.println("Main diagonal:");
		viewArray(arr);
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
			System.out.print("mas[" + i + "][" + i + "] = " + arr[i] + " ");
		}
	}

	private static int[] mainDiagonal(int[][] mas) {
		int[] arr;
		arr = new int[mas[0].length];

		for (int i = 0; i < mas.length; i++) {
			arr[i] = mas[i][i];
		}
		return arr;
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
