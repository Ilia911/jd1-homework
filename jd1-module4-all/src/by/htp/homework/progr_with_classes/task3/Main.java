package by.htp.homework.progr_with_classes.task3;

public class Main {

	public static void main(String[] args) {

		// Создать класс Student, содержащий поля: фамилия и инициалы, номер группы,
		// успеваемость (массив из пяти элементов). Создать массив из 10 элементов
		// такого типа. Дать возможность вывода фамилий и номеров групп студентов,
		// имеющих оценки, равные только 9 и 10

		int numOfStudents;
		int markMin;
		int markMax;
		Group gr112136;
		Group gr112136Sorted;

		numOfStudents = 10;
		markMin = 9;
		markMax = 10;

		Helper help = new Helper(); // Класс для генерации группы
		gr112136 = help.createGroup("Ivanov E. A.", 112136, numOfStudents);

		gr112136Sorted = new Group(112136);
		GroupLogic grLog = new GroupLogic();
		gr112136Sorted = grLog.sortGroupWithMarks(gr112136, markMin, markMax);

		View pr = new View();
		pr.printFirst(gr112136);
		pr.printSorted(gr112136Sorted, markMin, markMax);
	}

}
