package by.htp.homework.basic_of_oop.task2;

public class Main {

	public static void main(String[] args) {

		// Создать класс Payment с внутренним классом, с помощью объектов которого можно
		// сформировать покупку из нескольких товаров

		Payment payment1 = new Payment();

		payment1.add("smartphone", 12.5);
		payment1.add("flashcard", 8);
		payment1.add("laptop", 28.65);
		payment1.remove(0);

		View.print(payment1);
	}

}
