package by.htp.homework.pattern_matcher.task_one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicSortSentence {

	public String wordLengthSort(String text) {
		String newText = "";
		String temp;

		Pattern pat = Pattern.compile(".+?[!?\\.]");
		Matcher mat = pat.matcher(text);

		while (mat.find()) {

			temp = text.substring(mat.start(), mat.end() - 1);
			newText = newText + wordsSort(temp) + text.substring(mat.end() - 1, mat.end());
		}
		return newText;
	}

	private static String wordsSort(String temp) {
		String[] words;
		String newSentence = "";
		String min;
		int indexMin;

		words = temp.split(" ");

		for (int i = 0; i < words.length - 1; i++) {
			min = words[i];
			indexMin = i;

			for (int j = i + 1; j < words.length; j++) {

				if (min.length() > words[j].length()) {
					min = words[j];
					indexMin = j;
				}
			}
			words[indexMin] = words[i];
			words[i] = min;
		}
		for (int i = 0; i < words.length; i++) {
			newSentence = newSentence + " " + words[i];
		}
		return newSentence;
	}

	public String wordPatternSort(String text, Pattern patFind) {

		String newText = "";
		String temp;

		Pattern pat = Pattern.compile(".+?[!?\\.]");
		Matcher mat = pat.matcher(text);

		while (mat.find()) {

			temp = text.substring(mat.start(), mat.end() - 1);

			newText = newText + wordsSort(temp, patFind) + text.substring(mat.end() - 1, mat.end());
		}
		return newText;
	}

	private static String wordsSort(String temp, Pattern pat) {
		String[] words;
		String newSentence = "";
		String min;
		int indexMin;
		LogicPatternAlphabetWordSort sortTwoWords = new LogicPatternAlphabetWordSort();

		words = temp.split(" ");

		for (int i = 0; i < words.length - 1; i++) {

			min = words[i];
			indexMin = i;

			for (int j = i + 1; j < words.length; j++) {

				if (!min.equals(sortTwoWords.min(min, words[j], pat))) {
					min = words[j];
					indexMin = j;
				}
			}
			words[indexMin] = words[i];
			words[i] = min;
		}
		for (int i = 0; i < words.length; i++) {
			newSentence = newSentence + " " + words[i];
		}
		return newSentence;
	}
}
