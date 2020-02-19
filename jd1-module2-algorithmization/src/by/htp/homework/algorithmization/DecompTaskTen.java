package by.htp.homework.algorithmization;

public class DecompTaskTen {

	public static void main(String[] args) {

		// Дано натуральное число N. Написать методы для формирования массива,
		// элементами которого являются цифры числа N

		int n;
		int[] arr;

		n = 1234509876;
		arr = createArray(n);
		print(n, arr);
	}

	private static int[] createArray(int n) {
		int[] arr;
		int num;
		int temp;

		temp = n;
		num = 0;
		while (temp > 0) {
			num = num + 1;
			temp = temp / 10;
		}
		arr = new int[num];

		for (int i = 0; i <arr.length; i++) {
			arr[i] = n%10;
			n = n/10;
		}
		return arr;
	}

	private static void print(int n, int[] arr) {
		
		System.out.println("Task ten. N = " + n);
		System.out.println("Digit's array: ");
		printArray(arr);
		System.out.println("");
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("line[" + "%2d" + "] = " + "%1d ", i, arr[i]);
		}
	}
}
