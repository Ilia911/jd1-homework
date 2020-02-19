package by.htp.homework.basic;

public class LinTask2 {

	public static void main(String[] args) {

		// Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения)

		double result;
		double a;
		double b;
		double c;

		a = 2;
		b = 3;
		c = 4;

		result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b);
		
		System.out.println("Task two. Result = " + result);

	}

}
