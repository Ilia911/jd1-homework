package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskNine {

	public static void main(String[] args) {

		// Посчитать количество строчных (маленьких) и прописных (больших) в введенной
		// строке. Учитывать только английские буквы

		int numUpperCase;
		int numLowerCase;
		String str = "Java Is My Passion! Привет!";
		
		numUpperCase = calculateNumUpperCase(str);
		numLowerCase = calculateNumLowerCase(str);
		print(numUpperCase, numLowerCase);		
	}

	private static int calculateNumUpperCase(String str) {
		int num;
		String upper;
		String temp;

		num = 0;
		upper = "";

		for (int i = 65; i <= 90; i++) {
			upper += (char) i;
		}
		
		for (int i = 0; i < str.length(); i++) {
			temp = "" + str.charAt(i);
			if (upper.contains(temp)) {
				num++;
			}
		}
		return num;
	}

	private static int calculateNumLowerCase(String str) {
		int num;
		String upper;
		String temp;

		num = 0;
		upper = "";

		for (int i = 97; i <= 122; i++) {
			upper += (char) i;
		}
		
		for (int i = 0; i < str.length(); i++) {
			temp = "" + str.charAt(i);
			if (upper.contains(temp)) {
				num++;
			}
		}
		return num;
	}

	private static void print(int numUp, int numLow) {
		System.out.println("Task nine. Count of uppercase = " + numUp);
		System.out.println("Count of lowercase = " + numLow);
	}
}
