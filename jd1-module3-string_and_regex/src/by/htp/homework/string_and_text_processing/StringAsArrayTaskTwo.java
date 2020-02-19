package by.htp.homework.string_and_text_processing;

public class StringAsArrayTaskTwo {

	public static void main(String[] args) {
		
		// Change all words "word" in the string into the word "letter"
		
		String str = new String();
		str = "I know 3000 English words. But I Use only 2000 words.";
		
		str = changeStr(str);
		print(str);

	}
	private static String changeStr(String str) {
		String changed = new String("");
		changed = str.replace("word", "letter");
		
		return changed;
	}
	private static void print(String str) {
		System.out.println("Task two.");
		System.out.println(str);
	}

}
