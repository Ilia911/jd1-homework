package by.htp.homework.algorithmization;

import java.util.Random;

public class SortTaskOne {

	public static void main(String[] args) {

		// Заданы два одномерных массива с различным количеством элементов и натуральное
		// число К. Объединить их в один массив, включив второй массив между К и (К+1)-м
		// элементом первого. При этом не используя дополнительный массив

		double[] arrN;
		double[] arrM;
		double[] arrNM;
		int n;
		int m;		
		int k;
		Random rand;

		rand = new Random();

		n = rand.nextInt(5) + 5;
		m = rand.nextInt(10);

		if (n == m) { // Проверка чтобы в массивах было различное количество элементов
			n = n + 1;
		}
		k = n / 2; // Чтобы элемент К находился в середине массива

		arrN = createArr(n);
		arrM = createArr(m);
		arrNM = createArrSum(arrN, arrM, k);
		System.out.println("Task one.");
		System.out.println("Array one:");
		viewArr(arrN);		
		System.out.println("Array two:");
		viewArr(arrM);
		System.out.println("Num K = " + k);
		System.out.println("Array result:");
		viewArr(arrNM);

	}

	private static double[] createArr(int n) {
		double[] arr = new double[n];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() + rand.nextInt(20) - 10;
		}
		return arr;
	}

	private static double[] createArrSum(double[] arr1, double[] arr2, int k) {
		int nm = arr1.length + arr2.length;
		double[] arrSum = new double[nm];
		int temp = 0;

		for (int i = 0; i < arrSum.length; i++) {
			if (i <= k) {
				arrSum[i] = arr1[i];
			} else {
				if (i > k + arr2.length) {
					arrSum[i] = arr1[i - arr2.length];
				} else {
					arrSum[i] = arr2[temp];
					temp = temp + 1;
				}
			}

		}
		return arrSum;
	}

	private static void viewArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%2d] = %-8.3f ", i, arr[i]);
			System.out.println("");
		}
		
	}

}
