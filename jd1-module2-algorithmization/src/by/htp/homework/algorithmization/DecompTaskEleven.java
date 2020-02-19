package by.htp.homework.algorithmization;

public class DecompTaskEleven {

	public static void main(String[] args) {
		
		// Написать методы, определяющие в каком из данных двух чисел больше цифр
		
		// Задача решена для переменных типа double
		
		double figureOne;
		double figureTwo;
		int result;
		
		figureOne = -123092;
		figureTwo = 0.123091;
		
		result = findMax(figureOne, figureTwo);
		print(figureOne, figureTwo,result);

	}
	
	private static int findMax(double figureOne, double figureTwo) {
		
		int result;
		int numOne;
		int numTwo;
		numOne = findNum(figureOne);
		numTwo = findNum(figureTwo);
		
		result = 0;
		if (numOne > numTwo) {
			result = 1;
		}
		else if (numTwo > numOne) {
			result = 2;
		}		
		return result;
	}
	
	private static int findNum(double figure) {
		int result;
		String text;
		
		figure = Math.abs(figure);
		text = Double.toString(figure);
		result = text.length();
						
		return result;
	}
	
private static void print(double figureOne, double figureTwo, int result) {
		
		System.out.println("Task eleven.");
		System.out.println("Figure one =  " + figureOne);
		System.out.println("Figure two =  " + figureTwo);
		
		if (result == 1) {
			System.out.println("This figure has maximum digits: " + figureOne);
		} 
		else if (result == 2) {
			System.out.println("This figure has maximum digits: " + figureTwo);
		} else {
			System.out.println("These figures have equel quantity of digits");
		}
	}

}
