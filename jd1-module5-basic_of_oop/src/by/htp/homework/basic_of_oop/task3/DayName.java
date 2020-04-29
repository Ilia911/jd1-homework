package by.htp.homework.basic_of_oop.task3;

public enum DayName {

	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRYDAY, SATURDAY, SUNDAY;

	public boolean isDayOff() {
		switch (this) {
		case SUNDAY:
		case SATURDAY:
			return true;
		default:
			return false;
		}
	}

}
