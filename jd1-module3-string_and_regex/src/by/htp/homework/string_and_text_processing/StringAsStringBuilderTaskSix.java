package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskSix {

	public static void main(String[] args) {

		// Из заданной строки получить новую, повторив каждый символ дважды

		String newStr;
		
		String str = "Java is my passion!";		

		newStr = getNewStr(str);
		print(newStr);

	}

	private static String getNewStr(String str) {
		
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			newStr = newStr + str.charAt(i) + str.charAt(i);
		}
		return newStr;
	}

	private static void print(String str) {
		System.out.println("Task six. New string: " + str);
	}

}
