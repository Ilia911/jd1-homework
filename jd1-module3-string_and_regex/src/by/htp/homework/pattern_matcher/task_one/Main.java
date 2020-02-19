package by.htp.homework.pattern_matcher.task_one;

import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		// Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
		// выполнять с текстом три различные операции: отсортировать абзацы по
		// количеству предложений; в каждом предложении отсортировать слова по длине;
		// отсортировать лексемы в предложении по убыванию количества вхождений
		// заданного символа, а в случае равенства - по алфавиту

		// Примечание: Сортировка слов по алфавиту производится без учета регистра

		String sortParagraphForNumSentences;
		String sortSentensesByWordLength;
		String sortSentensesByNumPatterns;

		String str = "Hello world. Let's go! yes. f af cff CfaF fffor.\n Java is your passion? Absolutely!\n By!";

		LogicText strLog = new LogicText();
		sortParagraphForNumSentences = strLog.sortParagraph(str);
		
		LogicSortSentence logSen = new LogicSortSentence();
		sortSentensesByWordLength = logSen.wordLengthSort(str);
		
		Pattern pat = Pattern.compile("F", Pattern.CASE_INSENSITIVE); 
		sortSentensesByNumPatterns = logSen.wordPatternSort(str, pat);
		
		View print = new View();
		print.viewResult(sortParagraphForNumSentences, sortSentensesByWordLength, sortSentensesByNumPatterns);
	}

}
