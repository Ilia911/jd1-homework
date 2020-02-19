package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskSeven {

	public static void main(String[] args) {

		// Вводится строка, необходимо из нее удалить все пробелы и повторяющиеся
		// символы

		String newStr;
		String str = "JJaavvaa  iiss  mmyy  ppaassssiioonn!!";
		newStr = changeStr(str);
		print(newStr);

	}

	private static String changeStr(String str) {

		String newStr = " "; // Задаем начальное значение чтобы также удалить все пробелы
		String temp;
		for (int i = 0; i < str.length(); i++) {
			temp = "" + str.charAt(i);
			if (!newStr.contains(temp)) {
				newStr = newStr + temp;
			}
		}
		newStr = newStr.trim(); // Да, метод выполняет 2 задачи
		return newStr;
	}

	private static void print(String str) {
		System.out.println("Task seven. New string: " + str);
	}

}
