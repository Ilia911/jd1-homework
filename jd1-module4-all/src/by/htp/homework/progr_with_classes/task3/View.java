package by.htp.homework.progr_with_classes.task3;

public class View {

	public void printFirst(Group gr) {
		Student[] stud = gr.getStud();
		System.out.println("Task three. \nfull group");
		for (int i = 0; i < stud.length; i++) {
			System.out.println(stud[i].toString());
		}
		System.out.println("");
	}

	public void printSorted(Group gr, int markMin, int markMax) {
		Student[] stud = gr.getStud();
		int temp = 0;

		System.out.println("Student(s) who has(have) marks [" + markMin + " - " + markMax + "]:");
		System.out.println("Student name;   group ");
		for (int i = 0; stud[i] != null; i++) {
			System.out.println(stud[i].getName() + " - " + stud[i].getNumGroup());
			temp++;
		}
		if (temp == 0) {
			System.out.println("Such students don't exist.");
		}
	}

}
