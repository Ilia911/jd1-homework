package by.htp.homework.basic_of_oop.task3;

public class Helper {		
	
	public static Calendar createCalendar(int year) {
		Calendar newCalendar;
		
		newCalendar = new Calendar(year);
		
		Calendar.Month month1 = newCalendar.new Month("April");
		Calendar.Month month2 = newCalendar.new Month("May");
			
		month1.addDay(newCalendar.new Day(1, DayName.WEDNESDAY, false));
		month1.addDay(newCalendar.new Day(2, DayName.THURSDAY, false));
		month1.addDay(newCalendar.new Day(3, DayName.FRYDAY, false));
		month1.addDay(newCalendar.new Day(4, DayName.SATURDAY, true));
		month1.addDay(newCalendar.new Day(5, DayName.SUNDAY, true));
		month1.addDay(newCalendar.new Day(6, DayName.MONDAY, false));
		month1.addDay(newCalendar.new Day(7, DayName.TUESDAY, false));
		month1.addDay(newCalendar.new Day(8, DayName.WEDNESDAY, false));
		month1.addDay(newCalendar.new Day(9, DayName.THURSDAY, false));
		month1.addDay(newCalendar.new Day(10, DayName.FRYDAY, false));
		month1.addDay(newCalendar.new Day(11, DayName.SATURDAY, true));
		month1.addDay(newCalendar.new Day(12, DayName.SUNDAY, true));
		month1.addDay(newCalendar.new Day(13, DayName.MONDAY, false));
		month1.addDay(newCalendar.new Day(14, DayName.TUESDAY, false));
		month1.addDay(newCalendar.new Day(15, DayName.WEDNESDAY, false));
		month1.addDay(newCalendar.new Day(16, DayName.THURSDAY, false));
		month1.addDay(newCalendar.new Day(17, DayName.FRYDAY, false));
		month1.addDay(newCalendar.new Day(18, DayName.SATURDAY, true));
		month1.addDay(newCalendar.new Day(19, DayName.SUNDAY, true));
		month1.addDay(newCalendar.new Day(20, DayName.MONDAY, false));
		month1.addDay(newCalendar.new Day(21, DayName.TUESDAY, false));
		month1.addDay(newCalendar.new Day(22, DayName.WEDNESDAY, false));
		month1.addDay(newCalendar.new Day(23, DayName.THURSDAY, false));
		month1.addDay(newCalendar.new Day(24, DayName.FRYDAY, false));
		month1.addDay(newCalendar.new Day(25, DayName.SATURDAY, true));
		month1.addDay(newCalendar.new Day(26, DayName.SUNDAY, true));
		month1.addDay(newCalendar.new Day(27, DayName.MONDAY, true));
		month1.addDay(newCalendar.new Day(28, DayName.TUESDAY, true));
		month1.addDay(newCalendar.new Day(29, DayName.WEDNESDAY, false));
		month1.addDay(newCalendar.new Day(30, DayName.THURSDAY, false));
		
		
		month2.addDay(newCalendar.new Day(1, DayName.FRYDAY, true));
		month2.addDay(newCalendar.new Day(2, DayName.SATURDAY, true));
		month2.addDay(newCalendar.new Day(3, DayName.SUNDAY, true));
		month2.addDay(newCalendar.new Day(4, DayName.MONDAY, false));
		month2.addDay(newCalendar.new Day(5, DayName.TUESDAY, false));
		month2.addDay(newCalendar.new Day(6, DayName.WEDNESDAY, false));
		month2.addDay(newCalendar.new Day(7, DayName.THURSDAY, false));
		month2.addDay(newCalendar.new Day(8, DayName.FRYDAY, false));
		month2.addDay(newCalendar.new Day(9, DayName.SATURDAY, true));
		month2.addDay(newCalendar.new Day(10, DayName.SUNDAY, true));
		month2.addDay(newCalendar.new Day(11, DayName.MONDAY, false));
		month2.addDay(newCalendar.new Day(12, DayName.TUESDAY, false));
		month2.addDay(newCalendar.new Day(13, DayName.WEDNESDAY, false));
		month2.addDay(newCalendar.new Day(14, DayName.THURSDAY, false));
		month2.addDay(newCalendar.new Day(15, DayName.FRYDAY, false));
		month2.addDay(newCalendar.new Day(16, DayName.SATURDAY, true));
		month2.addDay(newCalendar.new Day(17, DayName.SUNDAY, true));
		month2.addDay(newCalendar.new Day(18, DayName.MONDAY, false));
		month2.addDay(newCalendar.new Day(19, DayName.TUESDAY, false));
		month2.addDay(newCalendar.new Day(20, DayName.WEDNESDAY, false));
		month2.addDay(newCalendar.new Day(21, DayName.THURSDAY, false));
		month2.addDay(newCalendar.new Day(22, DayName.FRYDAY, false));
		month2.addDay(newCalendar.new Day(23, DayName.SATURDAY, true));
		month2.addDay(newCalendar.new Day(24, DayName.SUNDAY, true));
		month2.addDay(newCalendar.new Day(25, DayName.MONDAY, false));
		month2.addDay(newCalendar.new Day(26, DayName.TUESDAY, false));
		month2.addDay(newCalendar.new Day(27, DayName.WEDNESDAY, false));
		month2.addDay(newCalendar.new Day(28, DayName.THURSDAY, false));
		month2.addDay(newCalendar.new Day(29, DayName.FRYDAY, false));
		month2.addDay(newCalendar.new Day(30, DayName.SATURDAY, true));
		month2.addDay(newCalendar.new Day(31, DayName.SUNDAY, true));
	
		newCalendar.add(month1);
		newCalendar.add(month2);
		
		return newCalendar;
	}

}
