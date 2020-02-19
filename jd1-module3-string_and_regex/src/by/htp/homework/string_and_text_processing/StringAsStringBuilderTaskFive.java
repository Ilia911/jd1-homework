package by.htp.homework.string_and_text_processing;

public class StringAsStringBuilderTaskFive {

	public static void main(String[] args) {
		
		// Подсчитать сколько раз среди символов заданной строки встречается символ 'а'
		
		int num;
		String str = "In the string calculate count of symbol 'a' ";
		
		num = calculateSymbolA(str);
		print(num);

	}
	
	private static int calculateSymbolA(String str) {
		int num = 0;
		String temp;
		
		for (int i = 0; i < str.length(); i++) {
			temp = "1" +str.charAt(i);
			if (temp.contains("a")) {
				num++;
			}
		}		
		return num;
	}
	
	private static void print(int num) {
		System.out.println("Task five. Count of symbol 'a' = " + num);
	}

}
