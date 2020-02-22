package by.htp.homework.progr_with_classes.task6;

public class Main {

	public static void main(String[] args) {

		// Составить описание класса для представления времени. Предусмотреть
		// возможности установки времени и изменении его отдельных частей (час, минута,
		// секунда) с проверкой допустимости вводимых значений. В случае недопустимости
		// значений полей, поле установить в значение "0". Создать методы изменения
		// времени на заданное количество секунд, минут, часов.

		// Пояснение: при добавлении отрицательных значений времени, в случае достижения
		// минимальной границы, часы переходят в положение 23:59:59, 23:59:58, ...


		View view = new View();

		Watch currentTime = new Watch();
		view.printWatch(currentTime);

		currentTime.setHour(25);
		currentTime.setMinute(-31);
		currentTime.setSecond(41);
		view.printWatch(currentTime);

		Watch currentTime2 = new Watch(25, 30, -44);
		view.printWatch(currentTime2);

		Watch currentTime3 = new Watch(12, 00, 29);
		view.printWatch(currentTime3);

		currentTime3.addHour(-25);
		view.printWatch(currentTime3);

		currentTime3.addMinute(-61);
		view.printWatch(currentTime3);

		currentTime3.addSecond(25 * 60 * 60 + 61 * 60 - 29);
		view.printWatch(currentTime3);

	}

}
