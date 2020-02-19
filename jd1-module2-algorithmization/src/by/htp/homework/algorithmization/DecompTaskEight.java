package by.htp.homework.algorithmization;

import java.util.Random;

public class DecompTaskEight {

	public static void main(String[] args) {

		// Задан массив D. Определить следующие суммы
		// D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
		// Пояснение: составить методы для вычисления суммы трех последовательно
		// расположенных элементов массива с номерами от k до m

		// Примечание (мое). Т.к. для определения суммы 3-ех последовательно
		// расположенных элементов необходимо знать только одну границу -
		// первый или последний элемент, то в условиях ограничимся заданием
		// только номера начального элемента
		// В случае, если при суммировании мы можем выйти за пределы массива, то
		// суммируем меньше трех элементов

		int n;
		int[] arr;
		int[] firstPoint;
		int[] sum;
		int k;
		
		n = 15; // Количество элементов массива
		k = 3;
		firstPoint = createArray(k);

		arr = createArray(n);
		sum = findSumArr(arr, firstPoint);
		print(arr, firstPoint, sum);
	}
	
	private static int[] findSumArr(int[] arr, int[] k) {
		int[] sum;
		sum = new int[k.length];
		
		for(int i = 0; i < k.length; i++) {
			sum[i] = findSumThree(arr, k[i]);
		}		
		return sum;
	}

	private static int findSumThree(int[] arr, int k) {
		int sum;
		sum = 0;

		for (int i = k; i < k + 3 && i < arr.length; i++) {
			sum = sum + arr[i];
			}
		return sum;
	}	

	private static int[] createArray(int n) {
		Random rand;
		rand = new Random();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(15) + 1;
		}
		return arr;
	}

	private static void print(int[] arr, int[] firstPoint, int[] sum) {
		System.out.println("Task eight. Array:");
		printArray(arr);
		System.out.println("");
		System.out.println("Array first points:");
		printArray(firstPoint);
		System.out.println("");
		System.out.println("Array sum three items result:");
		printArray(sum);
	}
	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[" + "%2d" + "] = " + "%-3d  ", i, arr[i]);

		}
	}
}
