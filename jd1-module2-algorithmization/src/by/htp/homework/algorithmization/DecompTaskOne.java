package by.htp.homework.algorithmization;

import java.util.Random;

public class DecompTaskOne {

	public static void main(String[] args) {

		// Написать методы для нахождения наименьшего общего кратного и наибольшего
		// общего делителя для двух натуральных чисел

		Random rand;
		int a;
		int b;
		int nod;
		int nok;

		rand = new Random();

		a = rand.nextInt(10) + 1;
		b = rand.nextInt(15) + 1;

		nod = findNod(a, b);
		nok = findNok(a,b);
		
		print(a, b, nod, nok);

	}

	private static int findNod(int a, int b) {
		int nod;
		int min;
		nod = 1;

		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				nod = i;
				break;
			}
		}
		return nod;
	}
	
	private static int findNok(int a, int b) {
		int nok;
		int nod;
		int min;
		
		nod = 1;
		
		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				nod = i;
				break;
			}
		}
		
		nok = a*b/nod;
		
		
		return nok;
	}

	private static void print(int a, int b, int nod, int nok) {
		System.out.println("Task one.");
		System.out.println("a = " + a + ", b = " + b + ", nod = " + nod);
		System.out.println("a = " + a + ", b = " + b + ", nok = " + nok);
	}

}
