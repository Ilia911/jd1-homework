package by.htp.homework.progr_with_classes.task2;

public class Demo {

	public static void main(String[] args) {

		// Создать класс двумя переменными. Добавить конструктор с входными параметрами.
		// Добавить конструктор, инициализирующий параметры по умолчанию. Добавить get-
		// и set- методы для полей экземпляра класса

		Test2 test;
		test = new Test2();
		
		test.setNum1(3.1);
		
		Test2View test2View = new Test2View();
		
		test2View.printTest2(test);

	}

}
