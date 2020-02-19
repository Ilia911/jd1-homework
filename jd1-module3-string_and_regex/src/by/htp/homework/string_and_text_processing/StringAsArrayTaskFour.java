package by.htp.homework.string_and_text_processing;

public class StringAsArrayTaskFour {

	public static void main(String[] args) {
		
		// В строке найти количество чисел
		
		
		int count;
		String str = new String();
		str = "I know 3000 English words. But I Use only 2000 words.1";
		count = countNum(str);
		print(str, count);

	}

	private static int countNum(String str) {
		char[] ch = new char[str.length()];
		int result = 0;
		boolean[] temp = new boolean[str.length()+1];		

		ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			temp[i] = compareCharWithFigures(ch[i]);			
		}
		for (int i = 0; i <ch.length; i++) {
			if (temp[i] && !temp[i+1]) {
				result++;
			}
		}
		return result;
	}
	
	private static boolean compareCharWithFigures(char ch) {
		char[] check = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		for (int j = 0; j < check.length; j++) {
				if (ch == check[j]) {					
					return true;					
				}				
			}
		return false;
	}

	private static void print(String str, int count) {
		System.out.println("Task three.");
		System.out.println(str);
		System.out.println("Coutn of figures = " + count);
	}

}
