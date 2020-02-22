package by.htp.homework.progr_with_classes.task3;

import java.util.Arrays;

public class Student {
	private String name;
	private int numGroup;
	private int[] marks;

	public Student() {

	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int numGroup) {
		this.name = name;
		this.numGroup = numGroup;
	}

	public Student(String name, int numGroup, int[] marks) {
		this.name = name;
		this.numGroup = numGroup;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumGroup() {
		return numGroup;
	}

	public void setNumGroup(int numGroup) {
		this.numGroup = numGroup;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numGroup;
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
		Student other = (Student) obj;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numGroup != other.numGroup)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", numGroup=" + numGroup + ", marks=" + Arrays.toString(marks) + "]";
	}

}
