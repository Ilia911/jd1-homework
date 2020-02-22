package by.htp.homework.progr_with_classes.task4;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNumOfTrain {

	public int insertNumOfTrain(Train[] schedule) {
		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] numTrain = new int[schedule.length];

		for (int i = 0; i < schedule.length; i++) {
			numTrain[i] = schedule[i].getNumTrain();
		}
		System.out.println("Num's of availible trains:");
		System.out.printf(Arrays.toString(numTrain) + "\n");
		System.out.println("For further information insert num of the train >> ");

		while (!sc.hasNextInt()) {
			sc.next();
		}
		num = sc.nextInt();
		return num;

	}
}
