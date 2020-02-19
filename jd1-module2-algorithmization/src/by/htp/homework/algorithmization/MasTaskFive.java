package by.htp.homework.algorithmization;

public class MasTaskFive {

	public static void main(String[] args) {

		// Сформировать квадратную матрицу по заданному образцу
		// 1 1 1 ... 1	1 1
		// 2 2 2 ... 2	2 0
		// 3 3 3 ... 3	0 0		
		// .. .. .. .. .
		// n 0 0 ... 0	0 0

		int[][] mas;
		int n;

		n = 5; // n должно быть четным!
		n = n/2*2;

		mas = createMas(n);
		System.out.println("Task five. Original array:");
		viewMas(mas);

	}

	private static int[][] createMas(int n) {
		int[][] mas;
		mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length - i; j++) {				
					mas[i][j] = i + 1;				
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
