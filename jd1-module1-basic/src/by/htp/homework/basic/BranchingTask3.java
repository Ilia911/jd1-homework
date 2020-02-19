package by.htp.homework.basic;

public class BranchingTask3 {

	public static void main(String[] args) {

		// Даны три точки. Определить будут ли они расположены на одной прямой

		double pointOneX;
		double pointOneY;
		double pointTwoX;
		double pointTwoY;
		double pointThreeX;
		double pointThreeY;		

		pointOneX = 0;
		pointOneY = 0.00000001;
		pointTwoX = 2;
		pointTwoY = 2;
		pointThreeX = -2;
		pointThreeY = -2;		

		// Если все точки лежат на прямой, то площадь треугольника будет равна нулю.
		// Исходя из формулы: S = 1/2((х1-х3)(у2-у3)-(х2-х3)(у1-у3)) получим условие для
		// if.

		if ((pointOneX - pointThreeX) * (pointTwoY - pointThreeY) == (pointTwoX - pointThreeX)
				* (pointOneY - pointThreeY)) {
			System.out.println("These three points belong to one line");
		} else {
			System.out.println("These three points don't belong to one line");
		}
	}

}
