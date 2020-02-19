package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskTwo {

	public static void main(String[] args) {
		
		// In the string after each symbol 'a' insert the symbol 'b'
		
		String str = "In the string after each symbol 'A' insert the symbol 'b'";
		str = insertSymbolBAfterSymbolA(str);
		print(str);

	}
	
	private static String insertSymbolBAfterSymbolA(String str) {
		str = str.replace("a", "ab");
		str = str.replace("A", "Ab");
		return str;
	}
	
	private static void print(String str) {
		System.out.println("Task two. The new string: \n" + str);
	}

}
