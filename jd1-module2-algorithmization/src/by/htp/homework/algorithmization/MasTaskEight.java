package by.htp.homework.algorithmization;

import java.util.Random;
import java.util.Scanner;

public class MasTaskEight {

	public static void main(String[] args) {

		// В числовой матрице поменять местами значения двух столбцов.
		// Номера столбцов вводить с клавиатуры

		int[][] mas;
		int n;
		int m;
		int column1;
		int column2;

		System.out.println("Task eight.");
		System.out.println("Insert string quantity! n = > ");
		System.out.println("Insert column quantity! m = > ");
		n = scan();
		m = scan();
		System.out.println("Insert №№ swaped columns!");
		column1 = scan();
		column2 = scan();

		mas = createMas(n, m);
		System.out.println("Original array:");
		viewMas(mas);
		changeColumn(mas, column1, column2);
		System.out.println("New array:");
		viewMas(mas);

	}

	private static int[][] createMas(int n, int m) {
		Random rand;
		int[][] mas;
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

	private static void changeColumn(int[][] mas, int column1, int column2) {
		int temp;

		for (int i = 0; i < mas.length; i++) {
			temp = mas[i][column1];
			mas[i][column1] = mas[i][column2];
			mas[i][column2] = temp;

		}
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
