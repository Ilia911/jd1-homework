package by.htp.homework.agregation.task3;

public class Region {

	private City city;
	private String status;
	private String name;
	private double area;
	private int population;
	private int profit;

	{
		this.name = "Unknown";
	}

	public Region(City city) {
		if (!city.getStatus().equalsIgnoreCase("locality")) {
			this.name = city.getName() + " region";
			this.status = city.getStatus();
		}
		
		this.area = city.getArea();
		this.population = city.getPopulation();
		this.profit = city.getProfit();
	}

	public Region(City city, int population, double area, int profit) {
		if (!city.getStatus().equalsIgnoreCase("locality")) {
			this.name = city.getName() + " region";
			this.status = city.getStatus();			
		}
		
		this.area = city.getArea() + area;
		this.population = city.getPopulation() + population;
		this.profit = city.getProfit() + profit;
	}

	public void add(City city) {
		if (!city.getStatus().equalsIgnoreCase("locality")) {
			this.name = city.getName() + " region";
			this.status = city.getStatus();
		}
		this.area += city.getArea();
		this.population += city.getPopulation();
		this.profit += city.getProfit();

	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
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
		result = prime * result + ((city == null) ? 0 : city.hashCode());
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
		Region other = (Region) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
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
		return "Region [city=" + city + ", status=" + status + ", name=" + name + ", area=" + area + ", population="
				+ population + ", profit=" + profit + "]";
	}

}
