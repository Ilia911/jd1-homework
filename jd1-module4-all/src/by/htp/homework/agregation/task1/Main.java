package by.htp.homework.agregation.task1;

public class Main {

	public static void main(String[] args) {

		// Создать класс Текст используя классы Предложение, Слово. Методы: дополнить
		// текст, вывести на консоль текст, заголовок текста.

		String title = "Java";
		Word word2 = new Word("Java");
		Word word3 = new Word("is");
		Word word4 = new Word("my");
		Word word5 = new Word("passion");
		Word word6 = new Word("I'm");
		Word word7 = new Word("willing");
		Word word8 = new Word("to");
		Word word9 = new Word("work");
		Word word10 = new Word("very");
		Word word11 = new Word("hard");
		Word word12 = new Word("By");

		Sentence sentence2 = new Sentence(word2);
		sentence2.add(word3);
		sentence2.add(word4);
		sentence2.add(word5);
		Sentence sentence3 = new Sentence(word6);
		sentence3.add(word7);
		sentence3.add(word8);
		sentence3.add(word9);
		sentence3.add(word10);
		sentence3.add(word11);
		Sentence sentence4 = new Sentence(word12);

		Text text = new Text(title, sentence2);
		text.append(sentence3);
		text.append(sentence4);

		View view = new View();
		view.printTitle(text);
		view.printTextAndTitle(text);
	}

}
