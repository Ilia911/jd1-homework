package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskTen {

	public static void main(String[] args) {

		// Строка состоит из несколькоих предложений, каждое из которых кончается
		// точкой, восклицательным или вопросительным знаком. Определить количество
		// предложений в строке.

		String str = "Java Is My Passion! Правда? Absolutely.";

		int countSentences;

		countSentences = findMaxWord(str);
		print(countSentences);

	}

	private static int findMaxWord(String str) {

		int max;		
		String[] strArr;

		max = 0;
	
		strArr = str.split("[.!?]");
		max = strArr.length;

		return max;
	}

	private static void print(int str) {
		System.out.println("Task ten. Count of the sentences =  " + str);
	}

}
