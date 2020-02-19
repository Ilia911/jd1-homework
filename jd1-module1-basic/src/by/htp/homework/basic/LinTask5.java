package by.htp.homework.basic;

public class LinTask5 {

	public static void main(String[] args) {

		// Дано натуральное число Т в секундах. Вывести данное количество секунд в
		// формате ННч ММмин Sc

		int sec;
		int hour;
		int minute;
		int second;

		sec = 12345;
		
		hour = sec / 3600;
		minute = (sec - hour * 3600) / 60;
		second = sec % 60;

		System.out.println("Task five. Result = " + hour + "h " + minute + "mm " + second + "s");

	}

}
