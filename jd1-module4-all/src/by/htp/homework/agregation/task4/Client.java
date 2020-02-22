package by.htp.homework.agregation.task4;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String name;
	private final int id;
	private List<Account> list;

	{
		this.list = new ArrayList<Account>();
	}

	public Client(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void add(Account account) {
		list.add(account);
	}

	public void subtract(Account account) {
		list.remove(account);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getList() {
		return list;
	}

	public void setList(List<Account> list) {
		this.list = list;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Client other = (Client) obj;
		if (id != other.id)
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", id=" + id + ", list=" + list + "]";
	}

}
