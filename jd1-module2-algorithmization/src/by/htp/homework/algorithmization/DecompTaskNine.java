package by.htp.homework.algorithmization;

import java.util.Random;

public class DecompTaskNine {

	public static void main(String[] args) {

		// Даны числа x,y,z,t - длины сторон четырехугольника. Вычислить его площадь
		// если угол между сторонами x и y равен 90 градусов.

		double[] arr;
		double area;

		arr = createArray(4); // Создаем массив со сторонами четырехугольника. x,y - 0-ой и 1-ый элементы

		area = findArea(arr);
		print(arr, area);

	}

	private static double findArea(double[] arr) {
		double sum;
		double line;

		line = Math.pow((arr[1] * arr[1] + arr[0] * arr[0]), 0.5);
		sum = findAreaTriangle(line, arr[0], arr[1]) + findAreaTriangle(arr[2], arr[3], line);

		return sum;
	}

	private static double findAreaTriangle(double a, double b, double c) {

		double sum;
		double p;

		p = (a + b + c) / 2;
		sum = Math.pow((p * (p - a) * (p - b) * (p - c)), 0.5);
		return sum;
	}

	private static double[] createArray(int n) {
		Random rand;
		rand = new Random();
		double[] arr = new double[n];

		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(15) + 2;
		}
		return arr;
	}

	private static void print(double[] arr, double sum) {
		System.out.println("Task nine. Lines of the quadrangle:");
		printArray(arr);
		System.out.println("");
		System.out.println("The area of the quadrangle: ");
		System.out.printf("%6.3f", sum);
	}

	private static void printArray(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("line[" + "%2d" + "] = " + "%-6.3f  ", i + 1, arr[i]);

		}
	}
}
