package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskFourteen {

	public static void main(String[] args) {

		// Создать случайную матрицу mxn состоящую из нулей и единиц. Причем в каждом
		// столбце число единиц должно быть равно номеру столбца

		int[][] mas;
		int[] arr;
		int n;
		int m;
		Random rand;
		rand = new Random();
		int temp;

		System.out.println("Task fourteen.");

		n = rand.nextInt(20);
		m = rand.nextInt(20);		
		
		if ( m > n ) { // Если столбцов больше чем строк, то условие задачи невозможно выполнить
			temp = m;  // Делаем так чтобы число строк всегда было не меньше числа столбцов
			m = n;
			n = temp;
		}

		mas = createMas(n, m);
		System.out.println("Original array:");
		viewMas(mas);
		arr = findOne(mas);
		System.out.println("Num if the ones:");
		viewArray(arr);

	}

	private static int[][] createMas(int n, int m) {
		int temp;
		Random rand;
		int[][] mas;
		mas = new int[n][m];
		rand = new Random();

		for (int j = 1; j < mas[0].length; j++) {
			temp = 0;
			for (int i = 0; i < mas.length; i++) {
				if (mas[i][j] == 0) {
					mas[i][j] = rand.nextInt(2);
					} else {
						if (i == mas.length - 1) i = 0;
						continue;
					}
					if (mas[i][j] == 1) {
						temp = temp + 1;
						if (temp == j) 	break;
					}
								
				if (i == mas.length - 1) i = 0;				
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

	private static void viewArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("NumOne[%2d] = %-5d ", i, arr[i]);
		}
	}

	private static int[] findOne(int[][] mas) {
		int[] arr;
		arr = new int[mas[0].length];

		for (int j = 0; j < mas[0].length; j++) {
			for (int i = 0; i < mas.length; i++) {
				if (mas[i][j] == 1) {
					arr[j] = arr[j] + 1;
				}
			}
		}
		return arr;
	}

}
