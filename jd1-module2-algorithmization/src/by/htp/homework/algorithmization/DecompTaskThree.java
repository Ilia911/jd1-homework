package by.htp.homework.algorithmization;

public class DecompTaskThree {

	public static void main(String[] args) {

		// Вычислить площадь правильного шестиугольника со стороной равной а, используя
		// метод вычисления площади треугольника

		double a;
		double result;

		a = 5;
		result = findSquareHexagon(a);
		print(result);

	}
	private static double findSquareHexagon(double a) {
		double result;

		result = 6*findSquareTriangle(a);

		return result;
	}

	private static double findSquareTriangle(double a) {
		double result;

		result = Math.pow(3, (0.5)) * a * a / 4;

		return result;
	}
	
	private static void print(double result) {
		System.out.println("Task three.");
		System.out.printf("Result = %-6.3f" , result);
		
	}

}
