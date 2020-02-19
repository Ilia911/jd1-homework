package by.htp.homework.algorithmization;

public class DecompTaskTwelwe {

	public static void main(String[] args) {

		// Даны натуральные числа K и N. Написать методы формирования массива А,
		// элементами которого будут числа, сумма цифр которых будет равна К и которые
		// не больше N

		// Самое простое решение, которое удовлетворяет условию задачи - это массив из
		// единичек, размером числа К (самое маленькое натурально N = 1).
		// в таком случае нам даже не обязательно сравнивать элементы массива с N
		// Думаю, суть задачи в том, чтобы студент смог найти самое простое решение)

		int k;
		int n;
		int[] arr;
		k = 24;
		n = 1;

		arr = createArray(k);
		print(arr, k, n);
	}

	private static int[] createArray(int k) {

		int[] arr = new int[k];

		for (int i = 0; i < k; i++) {
			arr[i] = 1;
		}
		return arr;
	}

	private static void print(int[] arr, int k, int n) {
		System.out.println("Task twelwe.");
		System.out.println("k = " + k + "; n = " + n);
		System.out.println("Array:");
		printArray(arr);
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = " +  arr[i] + "; ");

		}
	}
}
