package by.htp.homework.agregation.task5;

import java.util.ArrayList;
import java.util.List;

public class Offer {

	private List<Tour> list;
	private OfferType type;
	
	{
		this.list = new ArrayList<Tour>();
		type = OfferType.BASIC;
	}
	
	public Offer() {}
	public Offer(OfferType type) {
		this.type = type;
	}
	public Offer(Tour tour) {
		list.add(tour);
			}
	public void add(Tour tour) {
		list.add(tour);
	}
	public void remove(Tour tour) {
		list.remove(tour);
	}
	public void remove (int id) {
		for (Tour t : this.list) {
			if (id == t.getId()) {
				list.remove(t);
				break;
			}
		}
	}
	
	public void setList(List<Tour> list) {
		this.list = list;
	}
	public List<Tour> getList() {
		return this.list;
	}
	public OfferType getType() {
		return type;
	}
	public void setType(OfferType type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Offer other = (Offer) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Offer [list=" + list + ", type=" + type + "]";
	}
	
}
