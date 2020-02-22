package by.htp.homework.progr_with_classes.task7;

public class Main {

	public static void main(String[] args) {

		// Описать класс, представляющий треугольник. Предусмотреть методы создания
		// треугольника, вычисления площади, периметра и точки пересечения медиан.

	
		Point a = new Point(0,0);
		Point b = new Point(0,3);
		Point c = new Point(4,0);
		double perimeter;
		double area;
		Point median;
		
		Triangle trian = new Triangle(a,b,c);
		TriangleLogic per = new TriangleLogic();
		
		perimeter = per.triangePerimeter(trian);
		area = per.triangleArea(trian);
		median = per.findMedian(trian);
		
		View view = new View();
		view.printTriangle(trian);
		view.printPerimeter(perimeter);
		view.printArea(area);
		view.printMedian(median);
	}

}
