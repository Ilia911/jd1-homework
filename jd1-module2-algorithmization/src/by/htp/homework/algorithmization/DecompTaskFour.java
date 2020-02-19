package by.htp.homework.algorithmization;

import java.util.Random;

public class DecompTaskFour {

	public static void main(String[] args) {

		// На плоскости заданы своими координатами n точек. Написать методы,
		// определяющие между какими из пар точек самое большое расстояние.
		// Указание. Координаты точек занести в массив

		double[][] mas;
		int[] max;
		int n;

		n = 34;

		mas = createMasCoord(n);
		max = findMaxLine(mas);
		print(max);
		

	}

	private static int[] findMaxLine(double[][] mas) {
		double max;
		double temp;
		int res[];
		
		res = new int[2];

		max = 0;
		for (int k = 0; k < mas[0].length - 1; k++)
			for (int j = k; j < mas[0].length; j++) {
				temp = Math.pow((mas[0][k] - mas[0][j]) * (mas[0][k] - mas[0][j])
						+ (mas[1][k] - mas[1][j]) * (mas[1][k] - mas[1][j]), 0.5);
				if (temp > max) {
					max = temp;
					res[0] = k;
					res[1] = j;					
				}
			}
		return res;

	}

	private static double[][] createMasCoord(int n) {
		double[][] mas;
		Random rand;

		mas = new double[2][n];
		rand = new Random();

		for (int j = 0; j < n; j++) {
			mas[0][j] = rand.nextDouble() + rand.nextInt(100) - 50;
			mas[1][j] = rand.nextDouble() + rand.nextInt(100) - 50;
		}
		return mas;
	}
	
	private static void print(int[] result) {
		System.out.println("Task four. Searched points:");
		System.out.printf("%-2d, %-2d", result[0], result[1]);
		
	}

}
