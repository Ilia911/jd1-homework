package by.htp.homework.basic;

import java.util.Scanner;

public class LoopTask2 {

	public static void main(String[] args) {

		// Вычислить значение функции на отрезке [a; b] с шагом = 2:
		// y = x; если x > 2
		// y = - x; если x <= 2

		int a;
		int b;
		int pointMin;
		int pointMax;
		int step;

		LoopTask2 in = new LoopTask2();

		System.out.println("Insert the border points of the line segment! >");

		a = in.reader();
		b = in.reader();

		System.out.println("Insert the step! > ");

		step = in.reader();

		pointMin = Math.min(a, b);
		pointMax = Math.max(a, b);

		System.out.println("Result: ");

		for (int i = pointMin; i < pointMax; i = i + step) {
			if (i > 2) {
				System.out.print(i + "; ");
			} else {
				System.out.print(-i + "; ");
			}
		}

	}

	private int reader() {

		//Метод для считывания границ отрезка

		int x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("The wrong input");
			System.out.println("Try again! > ");
		}
		x = sc.nextInt();
		return (x);
	}

}
