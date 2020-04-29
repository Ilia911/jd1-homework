package by.htp.homework.basic_of_oop.task3;

public class Main {

	public static void main(String[] args) {

		// Создать класс Календарь с внутренним классом, с помощью объектов которого
		// можно хранить данные о выходных и праздничных днях

		Calendar calendar;		
		View view;
		boolean result;
		CalendarLogic calendarLogic;
		Calendar holidayCalendar;

		calendar = Helper.createCalendar(2020); // там создаем календарь
		
		calendarLogic = CalendarLogic.getInstance();
		
		view = new View();
		
		// Проверка для одного конкретного дня из календаря:
		result = calendarLogic.isHoliday(calendar.getMonthList().get(1).getDayList().get(3));
		view.printResult(result);

		// Вывод всех нерабочих дней из календаря:
		
		holidayCalendar = calendarLogic.holidayDayList(calendar);
		view.printAllHolyday(holidayCalendar);
	}

}
