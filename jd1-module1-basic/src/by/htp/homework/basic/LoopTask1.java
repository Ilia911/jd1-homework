package by.htp.homework.basic;

import java.util.Scanner;

public class LoopTask1 {

	public static void main(String[] args) {

		// Написать программу, где пользователь вводит любое положительное целое число.
		// А программа суммирует все числа от одного до введенного пользователем числа.

		int x;
		int result;
		
		result = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Insert the positive number! >  ");

		do {
			while (!sc.hasNextInt()) {
				System.out.println("Your input is wrong! Please try again!");
				System.out.println("Insert the figure! > ");
				sc.next();
			}
			x = sc.nextInt();
			if (x < 0) {
				System.out.println("Your input is wrong! Please try again!");
			}
		} while (x < 0);

		for (int i = 0; i < x; i++) {
			result = result + i;
		}

		System.out.println("Task one. Sum = " + result);

	}

}
