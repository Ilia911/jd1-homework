package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskOne {

	public static void main(String[] args) {

		// Дан текст. Найти наибольшее количество подрядидущих пробелов

		int num = 0;
		String str = "  I know 3000 English words.    But I Use only 2000    words.         ";
		num = calculateNumWhitespace(str);
		print(num);
	}

	private static int calculateNumWhitespace(String str) {
		str = str + "1"; // Неправильно считет (меньше на 1) если строка не содержит ничего кроме
							// пробелов. Таким образом избавляюсь от этой особенности
		String str2 = " ";
		int max = 0;

		for (int i = 1; i < str.length(); i++) {
			if (str.contains(str2)) {
				max = i;
				str2 = str2 + " ";
			} else
				break;
		}

		return max;
	}

	private static void print(int num) {
		System.out.println("Task one. Max num of the whitespace is " + num);
	}
}