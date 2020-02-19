package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskEight {

	public static void main(String[] args) {

		// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и
		// вывести его на экран. Случай, когда самых длинных слов может быть несколько
		// не обрабатывать

		String maxStr;
		String str = new String("123 1234 12345 123456 1234567 12345678");
		
		maxStr = findMaxWord(str);
		print(maxStr);

	}

	private static String findMaxWord(String str) {
		
		String[] strArray;
		int max;
		String maxStr;
		
		strArray = str.split(" ");
		max = strArray[0].length();
		maxStr = strArray[0];

		for (int i = 1; i < strArray.length; i++) {
			if (max < strArray[i].length()) {
				max = strArray[i].length();
				maxStr = strArray[i];
			}
		}
		return maxStr;
	}

	private static void print(String str) {
		System.out.println("Task eight. Max word: " + str);
	}

}
