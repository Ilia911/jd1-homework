package by.htp.homework.algorithmization;

public class DecompTaskFourteen {

	public static void main(String[] args) {

		// Натуральное число, в записи которого n цифр, называется числом Армстронга,
		// если сумма его цифр, возведенная в степень n, равнт самому числу. Найти все
		// числа Армстронга от 1 до k.
		
		// Wikipedia дает отличное от того, что в задаче, определение числа Армстронга:
		// там каждую цифру в отдельности надо возводить в степень n
		// хотя для целей обучения это не важно

		int k;
		int[] arr;

		k = 3000;

		arr = findNumArmstrong(k);
		print(arr, k);

	}

	private static int[] findNumArmstrong(int k) {
		int[] arr;
		arr = new int[20];
		int sumDigit;
		int numDigit;
		int j;
		
		j = 0;

		for (int i = 1; i <= k; i++) {
			sumDigit = findSumDigit(i);
			numDigit = findNumDigit(i);
			if (i == Math.pow(sumDigit, numDigit)) {
				arr[j] = i;
				j = j+1;
			}
		}
		return arr;
	}

	private static int findSumDigit(int num) {
		int res;

		res = 0;

		while (num > 0) {
			res = res + num % 10;
			num = num / 10;
		}
		return res;
	}

	private static int findNumDigit(int num) {
		int res;

		res = 0;

		while (num > 0) {
			res = res + 1;
			num = num / 10;
		}
		return res;
	}

	private static void print(int[] arr, int k) {
		System.out.println("Task fourteen.");
		System.out.println("k = " + k);
		System.out.println("Array:");
		printArray(arr);
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] != 0)
				System.out.println(arr[i] + "; ");

		}
	}

}
