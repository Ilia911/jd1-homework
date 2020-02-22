package by.htp.homework.progr_with_classes.task4;

import java.util.GregorianCalendar;

public class Helper {
	public Train[] createTrainSchedule() {
		// Вспомогательный класс для создания массива поездов
		Train[] trainSchedule = new Train[5];

		trainSchedule[0] = new Train("Moscow",98345, new GregorianCalendar(2020, 1, 3, 13, 8));
		trainSchedule[1] = new Train("Moscow",21245, new GregorianCalendar(2020, 1, 3, 12, 01));
		trainSchedule[2] = new Train("Minsk",12678, new GregorianCalendar(2020, 1, 3, 17, 05));
		trainSchedule[3] = new Train("Vitebsk",567812, new GregorianCalendar(2020, 1, 3, 18, 8));
		trainSchedule[4] = new Train("Moscow",12345, new GregorianCalendar(2020, 1, 3, 21, 20));

		return trainSchedule;

	}

}
