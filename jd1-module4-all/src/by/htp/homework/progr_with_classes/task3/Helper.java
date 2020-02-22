package by.htp.homework.progr_with_classes.task3;

import java.util.Random;

public class Helper {

	// Это вспомогательный класс
	// В данной задаче будет находится метод генерации группы

	public Group createGroup(String basicName, int numGroup, int numOfStudents) {
		Group gr;
		String name;
		gr = new Group(numGroup);
		Student[] stud = new Student[numOfStudents];
		Random rand = new Random();

		for (int i = 0; i < numOfStudents; i++) {
			int[] marks = new int[5];
			for (int j = 0; j < 5; j++) {
				marks[j] = rand.nextInt(3) + 8;
			}
			name = basicName + i;
			stud[i] = new Student(name, numGroup, marks);
		}
		gr.setStud(stud);
		return gr;
	}

}
