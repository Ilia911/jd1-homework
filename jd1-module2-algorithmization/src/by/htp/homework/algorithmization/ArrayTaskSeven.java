package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskSeven {

	public static void main(String[] args) {

		// Даны действительные числа а[1], a[2],... a[2n]
		// найти max( a[1] + a[2n], a[2] + a[2n-1],..., a[n] + a[n+1] )

		int n;
		double[] arr;
		int num;
		double max;
		String numArr;
		double sum;

		n = 5;
		num = n * 2;
		numArr = new String();

		arr = createArray(num);

		System.out.println("Task seven. Array: ");
		viewArray(arr);
		System.out.println("");

		max = arr[0] + arr[num - 1];

		for (int i = 0; i < n; i++) {
			sum = arr[i] + arr[num - i - 1];
			if (max < sum) {
				max = sum;
				numArr = ("Array num: arr[" + i + "] =  " + arr[i] + "; arr[" + (num - i - 1) + "] = "
						+ arr[(num - i - 1)]);
			}
		}
		System.out.println(numArr);
		System.out.printf("max sum = " + "%-10.3f", max);

	}

	private static double[] createArray(int n) {

		Random rand;

		double[] arr = new double[n];
		rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() + rand.nextInt(100) - 50;
		}
		return arr;
	}

	private static void viewArray(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[" + i + "] = " + "%-10.3f ", arr[i]);
		}
	}

}
