package by.htp.homework.progr_with_classes.task10;

public class View {

	void printFirstStep(Schedule library) {
		System.out.println("Task ten. Original list of the flights:");

		for (Airline airline : library.getList()) {
			System.out.println(airline.toString());
		}
		System.out.println("");
	}

	void printDestinitionSelection(Schedule schedule, String destinition) {
		System.out.println("Criterion of the selection - 'destinition': " + destinition);
		System.out.println("Selected list of the flights:");

		for (Airline airline : schedule.getList()) {
			System.out.println(airline.toString());
		}
		System.out.println("");
	}

	void printDayOfWeekSelection(Schedule schedule, String weekDay) {
		System.out.println("Criterion of the selection - 'week day': " + weekDay);
		System.out.println("Selected list of the flights:");

		for (Airline airline : schedule.getList()) {
			System.out.println(airline.toString());
		}
		System.out.println("");
	}

	void printDayOfWeekAndDepatureTimeSelection(Schedule schedule, String dayOfWeek2, String checkTime) {
		System.out.println("Criterion of the selection - 'week day': " + dayOfWeek2 + "; 'after time': " + checkTime);
		System.out.println("Selected list of the flights:");

		for (Airline airline : schedule.getList()) {
			System.out.println(airline.toString());
		}
		System.out.println("");
	}

}
