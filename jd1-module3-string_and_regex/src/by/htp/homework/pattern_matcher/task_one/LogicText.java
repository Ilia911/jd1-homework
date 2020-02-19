package by.htp.homework.pattern_matcher.task_one;

public class LogicText {

	public String sortParagraph(String text) {
		String newText = "";

		String[] paragraphArr;

		paragraphArr = text.split("\n");

		int[] numSentence = new int[paragraphArr.length];

		for (int i = 0; i < paragraphArr.length; i++) {
			numSentence[i] = calculateNumOfSentences(paragraphArr[i]);
		}

		paragraphArr = createNewParagraphArr(paragraphArr, numSentence);
		newText = createNewText(paragraphArr);

		return newText;
	}

	private static int calculateNumOfSentences(String paragraph) {
		int numSenten = 0;
		String[] sentence;

		sentence = paragraph.split("[!?\\.]");

		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i].length() > 0) {
				numSenten++;
			}
		}
		return numSenten;
	}

	private static String[] createNewParagraphArr(String[] paragraph, int[] numSentence) {
		String strMin;
		int min;
		int indexMin;

		for (int i = 0; i < numSentence.length - 1; i++) {
			min = numSentence[i];
			strMin = paragraph[i];
			indexMin = i;

			for (int j = i + 1; j < numSentence.length; j++) {

				if (min > numSentence[j]) {
					min = numSentence[j];
					strMin = paragraph[j];
					indexMin = j;
				}
			}
			numSentence[indexMin] = numSentence[i];
			numSentence[i] = min;
			paragraph[indexMin] = paragraph[i];
			paragraph[i] = strMin;
		}
		return paragraph;
	}

	private static String createNewText(String[] paragraph) {
		String newText = "";

		for (int i = 0; i < paragraph.length; i++) {
			newText = newText + paragraph[i] + "\n";
		}
		return newText;
	}

}