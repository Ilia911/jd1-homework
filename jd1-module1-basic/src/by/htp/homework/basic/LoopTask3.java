package by.htp.homework.basic;

public class LoopTask3 {

	public static void main(String[] args) {

		// Найти сумму квадратов первых ста чисел

		int result = 0;

		for (int i = 0; i < 100; i++) {
			result = result + i * i;
		}

		System.out.println("Task three. Result = " + result);

	}

}
