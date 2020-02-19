package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskNine {

	public static void main(String[] args) {

		// В массиве целых чисел найти наиболее часто встречающееся число
		// Если таких чисел несколько, то определить наименьшее

		int[] arr;
		int[] arrNum;
		int[] arrNew;
		int n;
		int k;
		int maxNum;
		int min;

		n = 10;
		arrNum = new int[n];
		arrNew = new int[n];
		arr = createArr(n);

		System.out.println("Task nine. Array:");
		viewArray(arr);
		arrNum = calculateNum(arr); // Считаем количество повторений элементов
		maxNum = maxValue(arrNum); //  Находим максимальный элемент в массиве повторений		

		k = 0;
		for (int i = 0; i < arrNum.length; i++) {
			if (maxNum == arrNum[i]) {
				arrNew[k] = arr[i];
				k = k + 1;
			}
		}
		min = arrNew[0];
		for (int i = 0; i < k; i++) {
			if (min > arrNew[i]) {
				min = arrNew[i];
			}
		}

		System.out.println("");
		System.out.println("NumArray:");
		viewArray(arrNum);
		System.out.println("");
		System.out.println("NewArray:");
		viewArray(arrNew);
		System.out.println("");
		System.out.println("Result = " + min);

	}

	private static int[] createArr(int n) {
		int[] arr = new int[n];
		Random rand;
		rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(1000) - 500;
		}
		return arr;
	}

	private static void viewArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] =  " + arr[i] + "; ");
		}
	}
	private static int[] calculateNum(int[] arr) {
		int k;
		int[] arrNum;
		arrNum = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			k = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					k = k + 1;
				}
			}
			arrNum[i] = k;
		}
		return arrNum;
	}
	
	private static int maxValue(int[] arr) {
		
		int max;
		max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
}
