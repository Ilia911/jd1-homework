package by.htp.homework.basic;

public class BranchingTask4 {

	public static void main(String[] args) {

		// Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича.
		// Определить пройдет ли кирпич через отверстие.

		double holeA;
		double holeB;
		double brickX;
		double brickY;
		double brickZ;
		double brickAverage;
		double holeMinSize;
		double holeMaxSize;
		double brickMinSizeTemp;
		double brickMinSize;

		holeA = 255;
		holeB = 80;
		brickX = 255;
		brickY = 120;
		brickZ = 80.1;

		holeMinSize = Math.min(holeA, holeB);
		holeMaxSize = Math.max(holeA, holeB);
		brickMinSizeTemp = Math.min(brickX, brickY);
		brickMinSize = Math.min(brickMinSizeTemp, brickZ);

		if (brickX > brickY && brickX < brickZ) {
			brickAverage = brickX;
		} else if (brickY > brickX && brickY < brickZ) {
			brickAverage = brickY;
		} else {
			brickAverage = brickZ;
		}
		if (holeMinSize >= brickMinSize && holeMaxSize >= brickAverage) {
			System.out.println("The brick will pass through the hole");
		} else {
			System.out.println("The brick won't pass through the hole");
		}
	}

}
