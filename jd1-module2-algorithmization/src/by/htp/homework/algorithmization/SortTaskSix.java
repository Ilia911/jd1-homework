package by.htp.homework.algorithmization;

import java.util.Random;

public class SortTaskSix {

	public static void main(String[] args) {

		// Сортировка Шелла.
		// Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
		// Делается это следующим образом: сравниваются два соседних a[i] и a[i+1], если
		// a[i] < a[i+1], то продвигаются на один элемент вперед, если a[i] > a[i+1], то
		// производится перестановка и сдвигается на элемент назад. Составить алгоритм

		double[] arr;
		int n;
		Random rand;

		rand = new Random();

		n = rand.nextInt(10) + 2;
		arr = createArr(n);

		System.out.println("Task six.");
		System.out.println("Array:");
		viewArr(arr);
		shellaSort(arr);
		//shellaSort2(arr); // Второй вариант
		System.out.println("Sorted array: ");
		viewArr(arr);
	}

	private static void shellaSort(double[] arr) {

		double temp;

		// Считаю логичным в этом методе после завершения цепочки обменов при arr[i] >
		// arr[i+1] возвращаться к тому месту, где мы ее начали, т.к. сортировку мы
		// начинаем с нулевого элемента, значит при завершении движения меньшего
		// элемента на свое место, мы получаем уже упорядоченную последоательность для
		// проверенных элементов. Но делаю согласно условиям задачи

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = i - 2;
				if (i == -2) {
					i = 0;
				}
			}
		}
	}

	private static void shellaSort2(double[] arr) {

		double temp;

		// Собственно говоря, второй вариант

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				for (int j = i-1; j > -1; j--) {
					if (arr[j] > arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
					else break;
				}
			}
		}
	}

	private static double[] createArr(int n) {

		double[] arr = new double[n];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() + rand.nextInt(10);
		}
		return arr;
	}

	private static void viewArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%2d] = %-8.3f ", i, arr[i]);
		}
		System.out.println("");
	}

}
