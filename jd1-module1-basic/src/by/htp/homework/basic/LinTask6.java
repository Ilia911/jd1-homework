package by.htp.homework.basic;

public class LinTask6 {

	public static void main(String[] args) {

		// Для данной области составить линейную программу, которая печатает true если
		// точка с координатами (x,y) принадлежит закрашенной области, и false - в
		// противном случае

		double x;
		double y;
		boolean result;
		
		x = -4;
		y = 0;

		result = (y <= 4 && y > 0 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4);
		
		System.out.println("Task six. Does this point set in the area? - " + result);

	}

}
