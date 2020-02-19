package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskSixteen {

	static Random rand = new Random();

	public static void main(String[] args) {

		// Построить магический квадарат

		// Комментарий: для n = 3 квадрат находится отлично.
		// для n = 4 ищется долго, но пару раз у меня хватало терпения дождаться
		// надо перебирать варинты как-то по-другому
		
		// Но! решение свое полностью)

		int[][] mas;

		int n;

		n = 4;

		System.out.println("Task sixteen.");

		mas = createMas(n);
		System.out.println("Original matrix:");
		viewMas(mas);
		magicMatrix(mas);
		System.out.println("");
		System.out.println("Magic matrix:");
		viewMas(mas);
	}

	private static int[][] createMas(int n) {

		int[] arr;
		int k;
		int[][] mas;
		
		arr = new int[n*n];
		mas = new int[n][n];		
		 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		k = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = arr[k];
				k = k + 1;
			}
		}
		return mas;
	}		
		
	private static void changeMas(int[][] mas) {

		int i;
		int j;
		int i2;
		int j2;
		int temp;

		j = rand.nextInt(mas.length);
		i = rand.nextInt(mas.length);
		j2 = rand.nextInt(mas.length);
		i2 = rand.nextInt(mas.length);

		temp = mas[i][j];
		mas[i][j] = mas[i2][j2];
		mas[i2][j2] = temp;
	}

	private static int[] createRes(int[][] mas) {

		int[] arr;
		int k;

		arr = new int[mas.length * 2 + 2];
		k = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				arr[k] = arr[k] + mas[i][j];
			}
			k = k + 1;
		}
		for (int j = 0; j < mas[0].length; j++) {
			for (int i = 0; i < mas.length; i++) {
				arr[k] = arr[k] + mas[i][j];
			}
			k = k + 1;
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i == (mas[i].length - j - 1)) {
					arr[k] = arr[k] + mas[i][j];
				}
			}
		}
		k = k + 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i == j) {
					arr[k] = arr[k] + mas[i][j];
				}
			}
		}
		return arr;
	}

	private static void magicMatrix(int[][] mas) {

		int temp;
		int[] arr;
		changeMas(mas);
		arr = createRes(mas);

		while (true) {

			changeMas(mas);
			arr = createRes(mas);
			temp = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
				} else {
					temp = temp + 1;
					break;
				}
			}
			if (temp == 0) {
				break;
			}
		}
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
