package by.htp.homework.agregation.task1;

public class View {

	public void printTitle(Text text) {
		System.out.println("Title - " + text.getTitle());
	}

	public void printTextAndTitle(Text text) {
		System.out.println("Title - " + text.getTitle());
		System.out.println("text:");
		for (Sentence sentence : text.getText()) {
			System.out.print(sentence);
		}
	}

}
