package by.htp.homework.algorithmization;

import java.util.Random;

public class ArrayTaskFive {

	public static void main(String[] args) {

		// Даны целые числа a(i). Вывести на печать только те числа, которые больше их i
		// т.е. при a[i] > i

		int[] arr;
		int n;

		n = 20;

		arr = createArr(n);
		
		System.out.println("Task 5. Result:");

		for (int i = 0; i < n; i++) {
			if (arr[i] > i) {
				System.out.println("i = " + i + "; arr[" + "] = " + arr[i] + "; ");
			}
		}

	}

	private static int[] createArr(int n) {
		int[] arr = new int[n];
		Random rand;
		rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(20);
		}
		return arr;
	}

}
