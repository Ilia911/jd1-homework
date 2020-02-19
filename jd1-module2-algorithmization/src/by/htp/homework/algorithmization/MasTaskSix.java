package by.htp.homework.algorithmization;

public class MasTaskSix {

	public static void main(String[] args) {

		// Сформировать квадратную матрицу по заданному образцу
		// 1 1 1 ... 1 1 1
		// 0 1 1 ... 1 1 0
		// 0 0 1 ... 1 0 0
		// .. .. .. .. .
		// 0 1 1 ... 1 1 0
		// 1 1 1 ... 1 1 1
		

		int[][] mas;
		int n;

		n = 6; // n должно быть четным!
		n = n / 2 * 2;

		mas = createMas(n);
		System.out.println("Task six. Original array:");
		viewMas(mas);

	}

	private static int[][] createMas(int n) {
		int[][] mas;
		mas = new int[n][n];

		for (int i = 0; i < mas.length/2; i++) {
			for (int j = 0+i; j < mas[i].length - i; j++) {
				mas[i][j] = 1;
				mas[n-1-i][j] = 1;
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
