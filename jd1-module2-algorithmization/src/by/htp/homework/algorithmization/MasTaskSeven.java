package by.htp.homework.algorithmization;

public class MasTaskSeven {

	public static void main(String[] args) {

		// Сформировать квадратную матрицу по заданному образцу
		// и подсчитать количество положительных элементов в ней

		double[][] mas;
		int n;
		int result;

		n = 6; // n должно быть четным!
		n = n / 2 * 2;

		mas = createMas(n);
		System.out.println("Task seven. Original array:");
		viewMas(mas);
		result = calculatePos(mas);
		System.out.println("Result = " + result);

	}

	private static double[][] createMas(int n) {
		double[][] mas;
		mas = new double[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = Math.sin((i * i - j * j) / n);

			}
		}
		return mas;
	}

	private static int calculatePos(double[][] mas) {
		int result;
		result = 0;
		for (int i = 0; i < mas.length ; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 0) {
					result = result +1;
				}				
			}
		}
		return result;
	}

	private static void viewMas(double[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("mas[%d][%d] = %-6.3f ", i, j, mas[i][j]);
			}
			System.out.println("");
		}

	}

}
