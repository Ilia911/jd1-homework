package by.htp.homework.oop.task5.bean;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework.oop.task5.service.FlowerService;

public class FlowerComposition {

	private List<FlowerService> list;
	private Pack pack;
	private int sum;

	{
		list = new ArrayList<FlowerService>();
	}

	public FlowerComposition() {

	}

	public FlowerComposition(FlowerService flower) {
		this.list.add(flower);
	}

	public FlowerComposition(FlowerService flower, Pack pack) {
		this(flower);
		this.pack = pack;
	}

	public void add(FlowerService flower) {
		list.add(flower);
	}

	public List<FlowerService> getList() {
		return list;
	}

	public void setList(List<FlowerService> list) {
		this.list = list;
	}

	public Pack getPack() {
		return pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
		result = prime * result + sum;
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
		FlowerComposition other = (FlowerComposition) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (pack == null) {
			if (other.pack != null)
				return false;
		} else if (!pack.equals(other.pack))
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FlowerComposition [list=" + list + ", pack=" + pack + ", sum=" + sum + "]";
	}

}
