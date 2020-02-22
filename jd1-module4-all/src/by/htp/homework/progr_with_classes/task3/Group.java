package by.htp.homework.progr_with_classes.task3;

import java.util.Arrays;

public class Group {

	private Student[] stud;
	private int numGroup;

	public Group(int numGroup) {
		this.numGroup = numGroup;
	}

	public Group(int numGroup, Student[] stud) {
		this.stud = stud;
		this.numGroup = numGroup;
	}

	@Override
	public String toString() {
		return "Group [stud=" + Arrays.toString(stud) + ", numGroup=" + numGroup + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numGroup;
		result = prime * result + Arrays.hashCode(stud);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (numGroup != other.numGroup)
			return false;
		if (!Arrays.equals(stud, other.stud))
			return false;
		return true;
	}

	public Student[] getStud() {
		return stud;
	}

	public void setStud(Student[] stud) {
		this.stud = stud;
	}

	public int getNumGroup() {
		return numGroup;
	}

	public void setNumGroup(int numGroup) {
		this.numGroup = numGroup;
	}

}
