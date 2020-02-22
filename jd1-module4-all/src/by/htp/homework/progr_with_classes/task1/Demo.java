package by.htp.homework.progr_with_classes.task1;

public class Demo {

	public static void main(String[] args) {

		// Создать класс Test1 двумя переменными. Добавить метод вывода на экран и
		// методы изменения этих переменных. Добавить метод, который находит сумму
		// значений этих переменных, и метод, который находит наибольшее значение из
		// этих двух переменных

		int sum;
		int max;
		Test1 test;
		test = new Test1(2,3);
		test.setNum1(5);
		
		Test1Logic testLogic;
		testLogic = new Test1Logic();
		
		sum = testLogic.sum(test);
		max = testLogic.findMax(test);
		
		Test1View view;
		view = new Test1View();
		
		view.test1View(test);
		view.test1ViewMax(max);
		view.test1ViewSum(sum);	

	}

}
