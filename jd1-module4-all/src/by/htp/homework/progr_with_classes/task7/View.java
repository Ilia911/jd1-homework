package by.htp.homework.progr_with_classes.task7;

public class View {

	void printTriangle(Triangle tr) {
		System.out.println("Task Seven. Original Triangle:");
		System.out.println(tr.toString());

	}

	void printPerimeter(double per) {
		System.out.println("Perimeter of the triangle = " + per);
	}

	void printArea(double area) {
		System.out.println("Area of the triangle = " + area);
	}

	void printMedian(Point point) {
		System.out.println("Point of the medians' crossing: " + point.toString());
	}
}
