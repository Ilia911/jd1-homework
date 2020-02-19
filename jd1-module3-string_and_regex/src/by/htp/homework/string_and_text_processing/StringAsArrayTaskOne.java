package by.htp.homework.string_and_text_processing;

public class StringAsArrayTaskOne {

	public static void main(String[] args) {

		// Дан массив названий переменных в camelCase, преобразовать названия в
		// snake_case

		String[] arrStr;

		arrStr = createArray();
		changeArrayStr(arrStr);
		print(arrStr);

	}

	private static String[] createArray() {
		String[] arrStr = new String[5];
		arrStr[0] = "firstStep";
		arrStr[1] = "helloWorld";
		arrStr[2] = "iLoveJava";
		arrStr[3] = "myBrotherIsADoctor";
		arrStr[4] = "javaIsMyWayOfLife";
		return arrStr;
	}

	private static void changeArrayStr(String[] arrStr) {

		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = changeStr(arrStr[i]);

		}
	}

	private static String changeStr(String str) {
		char[] ch = new char[str.length()];
		String strChanged = "";

		ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == Character.toLowerCase(ch[i])) {
				strChanged = strChanged + ch[i];
			} else {
				strChanged = strChanged + "_" + Character.toLowerCase(ch[i]);
			}

		}
		return strChanged;
	}

	private static void print(String[] arrStr) {
		System.out.println("Task one.");
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
	}

}
