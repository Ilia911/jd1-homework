package by.htp.homework.basic;

public class BranchingTask1 {

	public static void main(String[] args) {

		// Даны 2 угла треугольника (в градусах). Определить существует ли такой
		// треугольник, и если да, то будет ли он прямоугольным.

		double angleOne;
		double angleTwo;

		angleOne = 60;
		angleTwo = 30;

		if ((angleOne + angleTwo) == 90) {
			System.out.println(" This triangle exists and it has an angle equal 90");
		} else if ((angleOne + angleTwo < 180) && (angleOne + angleTwo > 0)) {
			System.out.println("This triangle exists");
		} else {
			System.out.println("Such triangle doesn't exist");
		}
	}

}
