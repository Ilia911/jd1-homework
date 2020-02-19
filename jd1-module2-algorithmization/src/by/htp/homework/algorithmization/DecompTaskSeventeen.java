package by.htp.homework.algorithmization;

public class DecompTaskSeventeen {

	public static void main(String[] args) {

		// Из данного числа вычли сумму его цифр. Из результата вновь вычли сумму его
		// цифр и т. д. Сколько таких действий надо произвести, чтобы получился нуль?

		int result;
		int num;

		num = 10000000;
		result = numIteration(num);
		print(result);
	}

	private static int numIteration(int figure) {
		int num;
		num = 0;

		while (figure > 0) {
			figure = figure - sumFigures(figure);
			num = num + 1;
		}
		return num;
	}

	private static int sumFigures(int num) {
		int res;

		res = 0;

		while (num > 0) {
			res = res + num % 10;
			num = num / 10;
		}
		return res;
	}

	private static void print(int result) {
		System.out.println("Task seventeen.");
		System.out.println("Result: quantity of the iterations = " + result + ".");

	}

}
