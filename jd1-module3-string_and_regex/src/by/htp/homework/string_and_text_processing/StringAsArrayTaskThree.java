package by.htp.homework.string_and_text_processing;

public class StringAsArrayTaskThree {

	public static void main(String[] args) {

		// В строке найти количество цифр

		int count;
		String str = new String();
		str = "I know 3000 English words. But I Use only 2000 words.";
		count = countFigures(str);
		print(str, count);

	}

	private static int countFigures(String str) {
		char[] ch = new char[str.length()];
		int result = 0;
		char[] check = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < check.length; j++) {
				if (ch[i] == check[j]) {
					result++;
				}
			}
		}
		return result;
	}

	private static void print(String str, int count) {
		System.out.println("Task three.");
		System.out.println(str);
		System.out.println("Coutn of figures = " + count);
	}

}
