package by.htp.homework.basic_of_oop.task3;

public class CalendarLogic {

	private static CalendarLogic calendarLogic = new CalendarLogic();

	private CalendarLogic() {
	}

	public static CalendarLogic getInstance() {
		return calendarLogic;
	}

	public boolean isHoliday(Calendar.Day day) {
		return day.isHoliday();
	}

	public Calendar holidayDayList(Calendar calendar) {

		Calendar holidayCalendar = new Calendar();

		for (Calendar.Month month : calendar.getMonthList()) {
			Calendar.Month tempMonth = holidayCalendar.new Month(month.getTitle());
			holidayCalendar.add(tempMonth);
			for (Calendar.Day day : month.getDayList()) {
				if (day.isHoliday()) {
					tempMonth.addDay(day);
				}
			}

		}
		return holidayCalendar;
	}
}
