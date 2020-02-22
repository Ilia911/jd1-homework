package by.htp.homework.progr_with_classes.task8;

import java.util.ArrayList;

public class FlowerCustomer {

	private ArrayList<Customer> list = new ArrayList<Customer>();

	public FlowerCustomer() {
	}

	public FlowerCustomer(ArrayList<Customer> list) {
		this.list = list;
	}

	public FlowerCustomer(Customer customer) {
		this.list.add(customer);
	}

	void add(Customer customer) {
		list.add(customer);
	}

	void remove(int index) {
		list.remove(index);
	}

	void remove(Customer customer) {
		list.remove(customer);
	}

	public ArrayList<Customer> getList() {
		return list;
	}

	public void setList(ArrayList<Customer> list) {
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
		FlowerCustomer other = (FlowerCustomer) obj;
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
