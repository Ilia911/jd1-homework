package by.htp.homework.algorithmization;

import java.util.Random;

public class MasTaskTwelve {

	public static void main(String[] args) {

		// Отсортировать строки матрицы по возрастанию и убыванию значений элементов

		int[][] mas;		
		int n;
		int m;
		Random rand;

		rand = new Random();

		System.out.println("Task twelve.");

		n = rand.nextInt(4) + 3;
		m = n + 1;
		
		mas = createMas(n, m);
		System.out.println("Original matrix:");
		viewMas(mas);
		sortingMasUp(mas);
		System.out.println("Sorted matrix Up:");
		viewMas(mas);
		System.out.println("Sorted matrix Down:");
		sortingMasDown(mas);
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

	private static void sortingMasUp(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			sortingMergeUp(mas[i], 0, mas[i].length - 1);
		}

	}
	
	private static void sortingMasDown(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			sortingMergeDown(mas[i], 0, mas[i].length - 1);
		}

	}

	private static void sortingMergeUp(int[] arr, int left, int right) {

		if (right <= left) {
			return;
		}
		int mid = left + (right - left) / 2;

		sortingMergeUp(arr, left, mid);
		sortingMergeUp(arr, mid + 1, right);

		int[] buf = new int[arr.length];

		for (int k = left; k <= right; k++) {
			buf[k] = arr[k];
		}
		int i = left;
		int j = mid + 1;

		for (int k = left; k <= right; k++) {
			if (i > mid) {
				arr[k] = buf[j];
				j++;
			} else if (j > right) {
				arr[k] = buf[i];
				i++;
			} else if (buf[j] < buf[i]) {
				arr[k] = buf[j];
				j++;
			} else {
				arr[k] = buf[i];
				i++;
			}
		}
	}
	
	private static void sortingMergeDown(int[] arr, int left, int right) {

		if (right <= left) {
			return;
		}
		int mid = left + (right - left) / 2;

		sortingMergeDown(arr, left, mid);
		sortingMergeDown(arr, mid + 1, right);

		int[] buf = new int[arr.length];

		for (int k = left; k <= right; k++) {
			buf[k] = arr[k];
		}
		int i = left;
		int j = mid + 1;

		for (int k = left; k <= right; k++) {
			if (i > mid) {
				arr[k] = buf[j];
				j++;
			} else if (j > right) {
				arr[k] = buf[i];
				i++;
			} else if (buf[j] > buf[i]) {
				arr[k] = buf[j];
				j++;
			} else {
				arr[k] = buf[i];
				i++;
			}
		}
	}
}
