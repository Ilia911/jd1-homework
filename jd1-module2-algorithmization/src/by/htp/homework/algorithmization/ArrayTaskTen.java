package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskTen {

	public static void main(String[] args) {

		// Дан целочисленный массив. Сжать его выбросив каждый второй элемент
		// (освободившиеся элементы заполнить нулями). Новый массив не создавать

		int n;
		int[] arr;

		n = 20;
		arr = createArr(n);

		System.out.println("Task ten. Array:");
		viewArray(arr);
		for (int i = 1; i < arr.length; i = i + 2) {
			arr[i] = 0;
		}
		
		
		System.out.println("");
		System.out.println("NewArray:");
		viewArray(arr);

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

}
