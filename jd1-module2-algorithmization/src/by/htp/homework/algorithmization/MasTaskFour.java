package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskFour {

	public static void main(String[] args) {
		
		//  Сформировать квадратную матрицу по заданному образцу
		//  1	2	3	...	n
		//	n	n-1	n-2 ... n
		//  1	2	3	...	n
		//	n	n-1	n-2 ... n
		//	..	..	..	..	.
		// 	n	n-1	n-2 ... n
		
		int[][] mas;
		int n;
		
		n = 4; // mas size
		
		mas = createMas(n);
		System.out.println("Task four. Original array:");
		viewMas(mas);
		
	}

	private static int[][] createMas(int n) {
		int[][] mas;
		mas = new int[n][n];
		

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i%2 ==0) {
					mas[i][j] = j + 1;
				}
				else {
					mas[i][j] = n-j;
				}
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
