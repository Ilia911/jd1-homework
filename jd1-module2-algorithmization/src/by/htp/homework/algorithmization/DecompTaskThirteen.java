package by.htp.homework.algorithmization;

import java.util.Scanner;

public class DecompTaskThirteen {

	public static void main(String[] args) {

		// Два простых числа называются близнецами, если они отличаются друг от друга на
		// 2.
		// Найти и напечатать все пары близнецов из отрезка [n, 2n], где n - заданное
		// натуральное число, большее 2

		int n;
		int[] arr;

		n = scan();
		arr = findTwin(n);
		print(arr, n);
	}

	private static int scan() {
		int n;
		Scanner sc;

		sc = new Scanner(System.in);

		System.out.println("Insert n! > ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		if (n < 3) {
			n = 3;
		}
		return n;
	}

	private static int[] findTwin(int n) {
		int[] arr;

		arr = new int[n + 1];
		arr[0] = n;

		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + 1;
		}
		return arr;
	}

	private static void print(int[] arr, int n) {
		System.out.println("Task thirteen.");
		System.out.println("n = " + n);
		System.out.println("Array:");
		printArray(arr);
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length - 2; i++) {
			System.out.println(arr[i] + ", " + arr[i + 2] + "; ");

		}
	}

}
