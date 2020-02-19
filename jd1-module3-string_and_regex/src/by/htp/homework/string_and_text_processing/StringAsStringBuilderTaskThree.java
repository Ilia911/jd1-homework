package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskThree {

	public static void main(String[] args) {

		// Check: Is this word a palindrome?

		String str;
		boolean result;
		str = "trim_mirt";

		result = checkPalindrome(str);
		print(result);

	}

	private static boolean checkPalindrome(String str) {
		String strChanged = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			strChanged = strChanged + str.charAt(i);
		}
		System.out.println(str);
		System.out.println(strChanged);

		if (str.equalsIgnoreCase(strChanged)) {
			return true;
		} else {
			return false;
		}

	}

	private static void print(boolean result) {
		System.out.println("Task three. Is this word a palindrome? " + result);
	}

}
