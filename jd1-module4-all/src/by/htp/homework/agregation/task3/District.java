package by.htp.homework.agregation.task3;

import java.util.ArrayList;
import java.util.List;

public class District {

	private List<Region> list;
	private String name;
	private String status;
	private int population;
	private double area;
	private int profit;

	public District() {
		list = new ArrayList<Region>();
		this.name = "Unknown";
		this.status = "Unknown";
	}

	public void add(Region region) {
		list.add(region);
		if (region.getStatus().equalsIgnoreCase("capital") || region.getStatus().equalsIgnoreCase("city")) {
			this.status = region.getStatus();
			this.name = region.getName().replace("region", " district");
			}
		this.area = this.area + region.getArea();
		this.population = this.population + region.getPopulation();
		this.profit = this.profit + region.getProfit();
	}
	
	public List<Region> getList() {
		return list;
	}

	public void setList(List<Region> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + profit;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		District other = (District) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
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
		if (population != other.population)
			return false;
		if (profit != other.profit)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [list=" + list + ", name=" + name + ", status=" + status + ", population=" + population
				+ ", area=" + area + ", profit=" + profit + "]";
	}
	

}
