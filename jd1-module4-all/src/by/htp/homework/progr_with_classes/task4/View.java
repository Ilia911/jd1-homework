package by.htp.homework.progr_with_classes.task4;

import java.text.SimpleDateFormat;

public class View {

	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

	public void printOne(Train[] trainSchedule) {
		System.out.println("Task three.");
		System.out.println("Original array of the trains.");

		for (Train tr : trainSchedule) {
			System.out.print("N train - " + tr.getNumTrain() + ", Destitnition - " + tr.getDestination()
					+ ", Departule time - ");
			System.out.println(dateFormat.format(tr.getDepartuelTime().getTime()));
		}
		System.out.println();
	}

	public void printOneTrain(int numTrain, Train[] trainSchedule) {
		int temp = 0;

		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

		for (Train tr : trainSchedule) {
			if (numTrain == tr.getNumTrain()) {
				System.out.print("N train - " + tr.getNumTrain() + ", Destitnition - " + tr.getDestination()
						+ ", Departule time - ");
				System.out.println(dateFormat.format(tr.getDepartuelTime().getTime()));
				System.out.println();
			temp++;
			break;
			} 
		}
		if (temp == 0) {
			System.out.println("Incorrect input!");
		}
	}

	public void printTwo(Train[] trainSchedule) {

		System.out.println("Sorted schedule by train nums");

		for (Train tr : trainSchedule) {
			System.out.print("N train - " + tr.getNumTrain() + ", Destitnition - " + tr.getDestination()
					+ ", Departule time - ");
			System.out.println(dateFormat.format(tr.getDepartuelTime().getTime()));
		}
		System.out.println();
	}

	public void printThree(Train[] trainSchedule) {

		System.out.println("Sorted schedule by destinition and depatue time");

		for (Train tr : trainSchedule) {
			System.out.print("Destitnition - " + tr.getDestination() + ", Departule time - ");
			System.out.print(dateFormat.format(tr.getDepartuelTime().getTime()));
			System.out.println(", N train - " + tr.getNumTrain());
		}
		System.out.println();
	}

}
