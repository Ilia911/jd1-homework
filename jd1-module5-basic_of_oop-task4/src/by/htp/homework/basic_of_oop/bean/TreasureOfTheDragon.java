package by.htp.homework.basic_of_oop.bean;

import java.util.ArrayList;
import java.util.List;

public class TreasureOfTheDragon {

	private List<Treasure> list;
	private String name;

	{
		this.name = "unknown dragon's treasure";
	}

	public TreasureOfTheDragon() {
		this.list = new ArrayList<Treasure>();
	}

	public TreasureOfTheDragon(String name) {
		this.name = name;
		this.list = new ArrayList<Treasure>();
	}

	public TreasureOfTheDragon(Treasure treasure) {
		this();
		this.list.add(treasure);
	}

	public void add(Treasure treasure) {
		list.add(treasure);
	}

	public void remove(int index) {

		list.remove(index);

	}

	public List<Treasure> getList() {
		return list;
	}

	public void setList(List<Treasure> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		TreasureOfTheDragon other = (TreasureOfTheDragon) obj;
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
		return "TreasureOfTheDragon [list=" + list + ", name=" + name + "]";
	}

}
