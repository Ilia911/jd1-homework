package by.htp.homework.basic;

public class BranchingTask2 {

	public static void main(String[] args) {

		// Найти max { min(a,b), min(c,d)}

		double a ;
		double b;
		double c;
		double d;
		double minAB;
		double minCD;
		double result;
		
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		
		minAB = Math.min(a, b);
		minCD = Math.min(c, d);
		result = Math.max(minAB, minCD);
		
		System.out.println("Task two. Result = " + result);
	}

}
