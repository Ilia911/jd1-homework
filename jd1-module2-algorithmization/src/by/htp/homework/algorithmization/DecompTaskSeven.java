package by.htp.homework.algorithmization;

public class DecompTaskSeven {

	public static void main(String[] args) {

		// Написать методы для вычисления факториала всех нечетных цифр от 1 до 9

		int n;
		int[] arr;
		int[] result;

		n = 5; // размер массива для задания исходных данных
		arr = createArray(n);
		result = findFactorial(arr);
		print(arr, result);
	}

	private static int[] findFactorial(int[] arr) {
		int[] result;

		result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				result[i] = 1;
				for (int j = arr[i]; j > 0; j--) {

					result[i] = result[i] * (j);
				}
			}
		}

		return result;
	}

	private static int[] createArray(int n) {

		int[] arr = new int[n];

		arr[0] = 1;
		for (int i = 1; i < n; i++) {
			arr[i] = arr[i - 1] + 2;
		}
		return arr;
	}

	private static void print(int[] arr, int[] result) {

		System.out.println("Task seven. For these figures:");
		printArray(arr);
		System.out.println("");
		System.out.println("Factorials:");
		printArray(result);
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[" + "%1d" + "] = " + "%-10d  ", i, arr[i]);

		}
	}
}
