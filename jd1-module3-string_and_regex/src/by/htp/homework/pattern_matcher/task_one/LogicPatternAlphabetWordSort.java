package by.htp.homework.pattern_matcher.task_one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicPatternAlphabetWordSort {

	public String min(String word1, String word2, Pattern pat) {
		String min = "";
		int num1;
		int num2;

		num1 = numPat(word1, pat);
		num2 = numPat(word2, pat);

		if (num1 > num2) {
			min = word2;
		} else if (num1 < num2) {
			min = word1;
		} else {
			min = minAlphabetSequence(word1, word2);
		}
		return min;
	}

	private static int numPat(String word, Pattern pat) {
		int num = 0;
		Matcher mat = pat.matcher(word);

		while (mat.find()) {
			num++;
		}
		return num;
	}

	private static String minAlphabetSequence(String word1, String word2) {
		String min = "";
		String tempWord1;
		String tempWord2;
		int minNum;
		int tempNumWord1;
		int tempNumWord2;

		tempWord1 = word1.toLowerCase();
		tempWord2 = word2.toLowerCase();
		minNum = Math.min(word1.length(), word2.length());

		for (int i = 0; i < minNum; i++) {
			tempNumWord1 = tempWord1.charAt(i);
			tempNumWord2 = tempWord2.charAt(i);

			if (tempNumWord1 < tempNumWord2) {
				min = word1;
				return min;
			} else if (tempNumWord1 > tempNumWord2) {
				min = word2;
				return min;
			}
		}
		if (word1.length() < word2.length()) {
			min = word1;
		} else {
			min = word2;
		}
		return min;
	}

	public String max(String word1, String word2, Pattern pat) {
		String max = "";
		String min;

		min = min(word1, word2, pat);

		if (min.equals(word2)) {
			max = word1;
		} else {
			max = word2;
		}

		return max;
	}

}
