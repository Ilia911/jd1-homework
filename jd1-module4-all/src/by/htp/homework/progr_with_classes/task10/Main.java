package by.htp.homework.progr_with_classes.task10;

public class Main {

	public static void main(String[] args) {

		// Создать класс Airline (destinition, numFlight, planeType,depatrure time,
		// day of week). Определить конструкторы, set-, get- и
		// метод toString. Создать второй класс, агрегирующий массив типа Airline, с
		// подходящими конструкторами и методами. Задать критерии выбора данных и
		// вывести эти данные на консоль.
		// Найти и вывести список для заданного пункта назначения,
		// список рейсов для заданного дня недели, 
		// список рейсов для заданного дня недели, время вылета для которых больше заданного
		

		Schedule schedule = new Schedule();
		Schedule selectedFlights;
		ScheduleLogic select = new ScheduleLogic();
		String destinition = "Moscow";
		String dayOfWeek = "Monday";
		String dayOfWeek2 = "Tuesday";
		String checkTime = "15:00";

		View console = new View();

		schedule.add(new Airline("Moscow", 222333, "B37M", "07:45", "Monday"));
		schedule.add(new Airline("Moscow", 222111, "B38M", "13:05", "Tuesday"));
		schedule.add(new Airline("Kiev", 111333, "B37M", "17:20", "Monday"));
		schedule.add(new Airline("Kiev", 222444, "B38M", "20:10", "Tuesday"));
		
		console.printFirstStep(schedule);

		selectedFlights = select.destinitionSelection(schedule, destinition);
		console.printDestinitionSelection(selectedFlights, destinition);

		selectedFlights = select.weekDaySelection(schedule, dayOfWeek);
		console.printDayOfWeekSelection(selectedFlights, dayOfWeek);

		selectedFlights = select.weekDaySelection(schedule, dayOfWeek2);
		selectedFlights = select.depatureTimeSelection(selectedFlights, checkTime);
		console.printDayOfWeekAndDepatureTimeSelection(selectedFlights, dayOfWeek2, checkTime);
	}

}
