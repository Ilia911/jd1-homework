package by.htp.homework.algorithmization;

import java.util.Random;

public class SortTaskEight {

	public static void main(String[] args) {

		// Даны дроби p[1]/q[1], p[2]/q[2], ... , p[n]/q[n] (p,q - натуральные числа).
		// Составить программу, которая приводит эти дроби к общему знаменателю и
		// упорядочивает их в порядке возрастания.

		Fraction[] arr;
		int n;

		n = 10;

		arr = createArr(n);
		printArr(arr);
		sortFraction(arr);
		printArr(arr);

	}

	private static Fraction[] createArr(int n) {
		Fraction[] arr;
		Random rand;

		arr = new Fraction[n];
		rand = new Random();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i] = new Fraction();
				arr[i].setValues(rand.nextInt(5), rand.nextInt(10));

			}
		}
		return arr;
	}

	private static void printArr(Fraction[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		System.out.println("");
	}

	public static void sortFraction(Fraction[] arr) {
		int nok;
		Fraction temp;
		nok = findNokArr(arr);
		changeArr(arr, nok);

		System.out.println("nok =" + nok);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1].getNum() > arr[i].getNum()) {
				temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				for (int j = i - 1; j > 0; j--) {
					if (arr[j].getNum() < arr[j - 1].getNum()) {
						temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					} else
						break;
				}
			}
		}
	}

	private static int findNokArr(Fraction[] arr) {
		int nok;
		int temp;

		for (int k = 1;; k++) {
			temp = 0;
			for (int i = 0; i < arr.length; i++) {
				if (k % arr[i].getDen() == 0) {
				} else {
					temp = temp + 1;
					break;
				}
			}
			if (temp == 0) {
				nok = k;
				break;
			}
		}
		return nok;
	}

	private static void changeArr(Fraction[] arr, int nok) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].setValues(arr[i].getNum() * nok / arr[i].getDen(), nok);
		}
	}

}
