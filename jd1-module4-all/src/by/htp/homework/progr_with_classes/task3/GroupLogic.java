package by.htp.homework.progr_with_classes.task3;

public class GroupLogic {
	public Group sortGroupWithMarks(Group gr, int minMark, int maxMark) {
		Group groupSorted = new Group(gr.getNumGroup());
		Student[] stud = new Student[gr.getStud().length];
		StudentLogic stLog = new StudentLogic();
		int j = 0;
		
		for (int i = 0; i < gr.getStud().length; i++) {
			if (stLog.studentSelection(minMark, maxMark,gr.getStud()[i])) {
				stud[j] = gr.getStud()[i];
				j++;
			}
		}
		groupSorted.setStud(stud);
		
		return groupSorted;
	}

}
