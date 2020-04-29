package by.htp.homework.basic_of_oop.task3;

public class View {

	public void printAllHolyday(Calendar calendar) {
		System.out.println("Holidays:");
		for (Calendar.Month month : calendar.getMonthList()) {
			System.out.println(month.getTitle() + ":");
			for (Calendar.Day day : month.getDayList()) {
				if (day.isHoliday()) {
				System.out.println(day);
				}
			}
			
		}
		System.out.println("");
	}
	
	public void printResult(boolean result) {
		System.out.println("Is the day Holiday? - " + result);
	}

}
