package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskFour {

	public static void main(String[] args) {

		// С помощью функции копирования и конкатенации составить из слова "информатика"
		// слово "торт"
		
		// я так понял что надо использовать charAt()

		String str;
		String cake;
		str = "информатика";

		cake = createCake(str);
		print(cake);

	}

	private static String createCake(String str) {
		String cake;
		cake = "";
		cake = cake + str.charAt(7) + str.charAt(3) + str.charAt(4) + str.charAt(7);

		return cake;
	}

	private static void print(String result) {
		System.out.println("Task four. New word is " + result);
	}
}
