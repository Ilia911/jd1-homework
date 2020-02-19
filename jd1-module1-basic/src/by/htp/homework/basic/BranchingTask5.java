package by.htp.homework.basic;

public class BranchingTask5 {

	public static void main(String[] args) {

		// Вычислить значение функции:

		double x;
		double result;

		x = 4;

		if (x <= 3) {
			result = x * x - 3 * x + 9;
		} else {
			result = 1 / (x * x * x + 6);
		}

		System.out.println("Task five. Result = " + result);
	}
}
