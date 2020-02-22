package by.htp.homework.progr_with_classes.task9;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> list = new ArrayList<Book>();

	public Library() {
	}

	public Library(ArrayList<Book> list) {
		this.list = list;
	}

	public Library(Book book) {
		this.list.add(book);
	}

	void add(Book book) {
		list.add(book);
	}

	void remove(int index) {
		list.remove(index);
	}

	void remove(Book book) {
		list.remove(book);
	}

	public ArrayList<Book> getList() {
		return list;
	}

	public void setList(ArrayList<Book> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
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
		Library other = (Library) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FlowerCustomer [list=" + list + "]";
	}

}
