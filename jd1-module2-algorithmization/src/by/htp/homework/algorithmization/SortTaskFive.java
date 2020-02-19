package by.htp.homework.algorithmization;

import java.util.Random;

public class SortTaskFive {

	public static void main(String[] args) {

		// Сортировка вставками
		// Дана последовательность чисел а[1],[2], ..., a[n]
		// Делается это следующим образом. Пусть имеется упорядоченная
		// последовательность а[1],[2], ..., a[i], т.е.: а[1] <= a[2] <= ... <= a[n].
		// Берется следующее число a[i+1] и вставляется в последовательность так, чтобы
		// она была тоже возрастающей. Процесс продолжается до тех пор, пока все
		// элементы не будут перебраны.
		// Примечание: место помещения очередного элемета в отсортированную часть
		// производить с помощью двоичного поиска. Двоичный поиск оформить в виде
		// отдельной функции

		double[] arr;
		int n;
		Random rand;

		rand = new Random();

		n = rand.nextInt(10) + 2;
		arr = createArr(n);

		System.out.println("Task five.");
		System.out.println("Array:");
		viewArr(arr);
		insertionSort(arr);
		System.out.println("Sorted array: ");
		viewArr(arr);
	}

	private static void insertionSort(double[] arr) {
		double temp;
		int posMax;

		for (int i = 1; i < arr.length; i++) {
			posMax = findPosMax(arr, 0, i - 1, arr[i]); // Находим самый левый элемент, который будет больше искомого
			if (posMax != -1) {
				temp = arr[i];
				for (int j = i; j > posMax; j--) {
					arr[j] = arr[j - 1];
				}
				arr[posMax] = temp;
			}
		}
	}

	private static int findPosMax(double[] arr, int left, int right, double x) {

		int mid;
		int posMax;
		posMax = -1;

		do {
			mid = (left + right) / 2;
			if (arr[mid] > x) {
				right = mid - 1;
				posMax = mid;
			} else {
				left = mid + 1;
			}
		} while (left <= right);

		return posMax;
	}

	private static double[] createArr(int n) {

		double[] arr = new double[n];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() + rand.nextInt(10);
		}
		return arr;
	}

	private static void viewArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%2d] = %-8.3f ", i, arr[i]);
		}
		System.out.println("");
	}

}
