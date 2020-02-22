package by.htp.homework.progr_with_classes.task3;

public class StudentLogic {

	public boolean studentSelection(int numMin, int numMax, Student stud) {
		int[] marks;
		marks = stud.getMarks();
		for (int mark : marks) {
			if (mark >= numMin && mark <= numMax) {
			} else {
				return false;
			}
		}
		return true;
	}
}
