package by.htp.homework.basic;

public class LinTask4 {

	public static void main(String[] args) {

		// Дано действительное число вида nnn.ddd поменять дробную и целую часть местами

		double r;
		double integerPart;
		double decimalPart;
		double rChenged;

		r = 123.456;

		integerPart = (int) r;
		decimalPart = (r - integerPart) * 1000;
		decimalPart = (int) decimalPart;
		rChenged = decimalPart + integerPart / 1000;

		System.out.println("Task four. Result = " + rChenged);

	}

}
