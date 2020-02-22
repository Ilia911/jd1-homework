package by.htp.homework.agregation.task3;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private List<District> list;
	private String name;
	private String capital;
	private int population;
	private double area;
	private int profit;
	
	public State(String name) {
		this.name = name;
		this.list = new ArrayList<District>();
		capital = "Unknown";
	}
	
	public void add(District district) {
		list.add(district);
		
		if (district.getStatus().equalsIgnoreCase("capital")) {
			this.capital = district.getName().replace(" district", "");
		}
		this.area = this.area + district.getArea();
		this.population = this.population + district.getPopulation();
		this.profit = this.profit + district.getProfit();
	}
	
	public int countOfDistrict() {
		return this.list.size();
	}

	public List<District> getList() {
		return list;
	}

	public void setList(List<District> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
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
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + profit;
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
		State other = (State) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
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
		return true;
	}

	@Override
	public String toString() {
		return "State [list=" + list + ", name=" + name + ", capital=" + capital + ", population=" + population
				+ ", area=" + area + ", profit=" + profit + "]";
	}
	

}
