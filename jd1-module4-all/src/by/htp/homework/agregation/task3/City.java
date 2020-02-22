package by.htp.homework.agregation.task3;

public class City {

	private String name;
	private String status;
	private int population;
	private double area;
	private int profit;

	public City() {
	};

	public City(String name, int population, double area) {
		this.name = name;
		this.status = "town";
		this.population = population;
		this.area = area;
		
	}

	public City(String name, String status, int population, double area, int profit) {
		this.name = name;
		this.status = status;
		this.population = population;
		this.area = area;
		this.profit = profit;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPopulation() {
		return this.population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public double getArea() {
		return this.area;
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
		City other = (City) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
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
		return "City [name=" + name + ", status=" + status + ", population=" + population + ", area=" + area
				+ ", profit=" + profit + "]";
	}
	

}
