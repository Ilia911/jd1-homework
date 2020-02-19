package by.htp.homework.algorithmization;

public class DecompTaskFifteen {

	public static void main(String[] args) {

		// Найти все натуральные n-значные числа, цифры в которых образуют строго
		// возрастающую последовательность

		int[] arr;

		arr = findResultArray();
		print(arr);
	}

	private static int[] findResultArray() {

		int[] arr;
		int temp;
		int k;

		arr = new int[511];
		k = 0;

		for (int i = 1;; i++) {
			temp = findResFigure(i);

			if (temp > 0) {
				arr[k] = i;
				k = k + 1;
			}
			if (i > 123456789)
				break;
		}
		return arr;
	}

	private static int findResFigure(int num) {
		int res;

		res = 10;

		while (num > 0) {
			if (res <= num % 10) {
				res = 0;
				break;
			} else {
				res = num % 10;
				num = num / 10;
			}
		}
		return res;
	}

	private static void print(int[] arr) {
		System.out.println("Task fifteen.");
		System.out.println("Result:");
		printArray(arr);
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				System.out.println("arr[" + i + "] = " + arr[i] + "; ");

		}
	}

}
