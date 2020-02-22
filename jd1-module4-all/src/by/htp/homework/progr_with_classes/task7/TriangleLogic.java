package by.htp.homework.progr_with_classes.task7;

public class TriangleLogic {

	double triangePerimeter(Triangle tr) {
		double per;

		per = sideLength(tr.getA(), tr.getB()) + sideLength(tr.getA(), tr.getC()) + sideLength(tr.getC(), tr.getB());
		return per;

	}

	double triangleArea(Triangle tr) {
		double area;

		area = Math.abs((tr.getA().getX() - tr.getC().getX()) * (tr.getB().getY() - tr.getC().getY())
				- (tr.getB().getX() - tr.getC().getX()) * (tr.getA().getY() - tr.getC().getY())) / 2;
		return area;
	}

	Point findMedian(Triangle tr) {
		Point median = new Point();

		median.setX((tr.getA().getX() + tr.getB().getX() + tr.getC().getX()) / 3);
		median.setY((tr.getA().getY() + tr.getB().getY() + tr.getC().getY()) / 3);
		return median;
	}

	private static double sideLength(Point a, Point b) {
		double length;

		length = Math
				.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
		return length;
	}
}
