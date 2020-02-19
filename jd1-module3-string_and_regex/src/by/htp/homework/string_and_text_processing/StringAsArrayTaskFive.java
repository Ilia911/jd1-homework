package by.htp.homework.string_and_text_processing;

public class StringAsArrayTaskFive {

	public static void main(String[] args) {

		// Удалить в строке все лишние пробелы

		String str = new String();
		str = "  I know 3000 English words.    But I Use only 2000    words.       ";

		str = changeStr(str);
		print(str);

	}

	private static String changeStr(String str) {

		String changed;
		String changed2;
		changed = str.trim();
		changed2 = changed;
		do {
			changed = changed2;
			changed2 = changed.replace("  ", " ");
		} while (changed.length() != changed2.length());

		return changed;
	}

	private static void print(String str) {
		System.out.println("Task five.");
		System.out.println(str);
	}

}
