package by.htp.homework.basic;

import java.util.Scanner;

public class LoopTaskSeven {

	public static void main(String[] args) {

		// Для каждого натурального числа в промежутке [m,n] вывести все делители кроме
		// 1 и самого числа. m,n - вводятся с клавиатуры

		int m;
		int n;
		int startPoint;
		int finishPoint;

		System.out.println("Insert the first figure! > ");
		m = scan();
		System.out.println("Insert the second figure! > ");
		n = scan();

		startPoint = Math.min(m, n);
		finishPoint = Math.max(m, n);

		for (int i = startPoint; i <= finishPoint; i++) {
			System.out.print("Dividers for the figure " + i + ": ");
			int k = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + "; ");
					k++;
				}
			}
			if (k == 0) {
				System.out.print("Dividers are absent for such figure");
			}
			System.out.println(" ");
		}

	}

	private static int scan() {
		// The method for input figures

		int figurte;
		Scanner num = new Scanner(System.in);

		while (!num.hasNextInt()) {
			num.next();
			System.out.println("There's a mistake! Try again! > ");
		}
		figurte = num.nextInt();
		return (figurte);
	}

}
