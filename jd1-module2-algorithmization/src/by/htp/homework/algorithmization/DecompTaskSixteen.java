package by.htp.homework.algorithmization;

public class DecompTaskSixteen {

	public static void main(String[] args) {

		// Написать программу, определяющую сумму n-значных чисел, содержащих только
		// нечетные цифры, также определить сколько четных цифа в найденной сумме

		int result;
		int numEven;
		int n;
		n = 6;

		result = findSumOddFigures(n);
		numEven = findNumEvenFigures(result);
		print(result, numEven);
	}

	private static int findSumOddFigures(int n) {
		int result;
		int low;
		int high;
		int temp;

		low = (int) Math.pow(10, n);
		high = (int) Math.pow(10, n + 1);
		result = 0;
		temp = 0;

		for (int i = low; i < high; i++) {
			temp = findOddFigure(i);
			if (temp > 0) {
				result = result + i;
			}
		}
		return result;
	}

	private static int findOddFigure(int num) {
		int res;

		res = 1;

		while (num > 0) {
			if (num % 2 > 0) {
				num = num / 10;
			} else {
				res = 0;
				break;
			}
		}
		return res;
	}

	private static int findNumEvenFigures(int num) {
		int res;

		res = 0;

		while (num > 0) {
			if (num % 2 == 0 && num % 10 != 0) {
				res = res + 1;
			}
			num = num / 10;
		}
		return res;
	}

	private static void print(int result, int num) {
		System.out.println("Task sixteen.");
		System.out.println("Result sum = " + result);
		System.out.println("Quantity of even figures = " + num);
	}
}
