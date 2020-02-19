package by.htp.homework.algorithmization;

public class MagicSquare2 {

	public static void main(String[] args) {
		
		// вторая попытка решить эту задачу. первая в классе MasTaskSixteen
		// находится решение для n= 4

		int[][] mas;

		int n;

		n = 4;

		System.out.println("Task sixteen.");
		mas = createMas(n);
		System.out.println("Original matrix:");
		viewMas(mas);
		magicMatrix(mas);
		System.out.println("");
		System.out.println("Magic matrix:");
		viewMas(mas);
	}

	private static void magicMatrix(int[][] mas) {

		int temp;
		int[] arr;
		
		arr = createRes(mas);
		while (true) {
			changeMas(mas, arr);
			arr = createRes(mas);
			temp = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
				} else {
					temp = temp + 1;
					break;
				}
			}
			if (temp == 0) {
				break;
			}

		}
	}

	private static void changeMas(int[][] mas, int[] arr) {
		int i;
		int j;
		int i2;
		int j2;
		int temp;

		j = findNumMaxJ(arr, mas.length);
		i = findNumMaxI(arr, mas.length);
		j2 = findNumMinJ(arr, mas.length);
		i2 = findNumMinI(arr, mas.length);
		
		temp = mas[i][j];
		mas[i][j] = mas[i2][j2];
		mas[i2][j2] = temp;
	}

	private static int findNumMaxJ(int[] arr, int n) {
		int j;
		int max;

		j = 0;
		max = arr[0];

		for (int i = 1; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
				j = i;
			}
		}
		return j;
	}

	private static int findNumMaxI(int[] arr, int n) {
		int i;
		int max;

		i = n;
		max = arr[n];

		for (int j = n+1; j < 2 * n; j++) {
			if (max < arr[j]) {
				max = arr[j];
				i = j;
			}
		}
		return i - n;
	}

	private static int findNumMinJ(int[] arr, int n) {
		int j;
		int min;

		j = 0;
		min = arr[0];

		for (int i = 1; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
				j = i;
			}
		}
		return j;
	}

	private static int findNumMinI(int[] arr, int n) {
		int i;
		int min;

		i = n;
		min = arr[n];

		for (int j = n+1; j < 2 * n; j++) {
			if (min > arr[j]) {
				min = arr[j];
				i = j;
			}
		}
		return i - n;
	}

	private static int[] createRes(int[][] mas) {

		int[] arr;
		int k;

		arr = new int[mas.length * 2 + 2];
		k = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				arr[k] = arr[k] + mas[i][j];
			}
			k = k + 1;
		}
		for (int j = 0; j < mas[0].length; j++) {
			for (int i = 0; i < mas.length; i++) {
				arr[k] = arr[k] + mas[i][j];
			}
			k = k + 1;
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i == (mas[i].length - j - 1)) {
					arr[k] = arr[k] + mas[i][j];
				}
			}
		}
		k = k + 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if (i == j) {
					arr[k] = arr[k] + mas[i][j];
				}
			}
		}
		return arr;
	}

	private static int[][] createMas(int n) {

		int[] arr;
		int k;
		int[][] mas;

		arr = new int[n * n];
		mas = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		k = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = arr[k];
				k = k + 1;
			}
		}
		return mas;
	}

	private static void viewMas(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("mas[%d][%d] = %-4d ", i, j, mas[i][j]);
			}
			System.out.println("");
		}
	}
}
