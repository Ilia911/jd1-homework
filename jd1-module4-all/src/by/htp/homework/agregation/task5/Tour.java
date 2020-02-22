package by.htp.homework.agregation.task5;

import java.util.Comparator;

public class Tour {
	
	
	private int id;
	private TourType type;
	private Transportation transport;
	private Food food;
	private Destinition destinition;
	private int numNights;
	private int price;
	
	public Tour(int id, TourType type, Transportation transport, Food food,
			Destinition destinition, int numNights, int price) {
		this.id = id;
		this.type = type;
		this.transport = transport;
		this.food = food;
		this.destinition = destinition;
		this.numNights = numNights;
		this.price = price;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public TourType getType() {
		return type;
	}

	public void setType(TourType type) {
		this.type = type;
	}

	public Transportation getTransport() {
		return transport;
	}

	public void setTransport(Transportation transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Destinition getDestinition() {
		return destinition;
	}

	public void setDestinition(Destinition destinition) {
		this.destinition = destinition;
	}

	public int getNumNights() {
		return numNights;
	}

	public void setNumNights(int numNights) {
		this.numNights = numNights;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destinition == null) ? 0 : destinition.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + id;
		result = prime * result + numNights;
		result = prime * result + price;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
		Tour other = (Tour) obj;
		if (destinition != other.destinition)
			return false;
		if (food != other.food)
			return false;
		if (id != other.id)
			return false;
		if (numNights != other.numNights)
			return false;
		if (price != other.price)
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", type=" + type + ", transport=" + transport + ", food=" + food + ", destinition="
				+ destinition + ", numNights=" + numNights + ", price=" + price + "]";
	}
	
	public static Comparator<Tour> ById = new Comparator<Tour>() {

		@Override
		public int compare(Tour o1, Tour o2) {
			return o1.getId() - o2.getId();
		}		
	};
	
	public static Comparator<Tour> ByNumNights = new Comparator<Tour>() {

		@Override
		public int compare(Tour o1, Tour o2) {
			return o1.getNumNights() - o2.getNumNights();
		}		
	};
	
	public static Comparator<Tour> ByPrice = new Comparator<Tour>() {

		@Override
		public int compare(Tour o1, Tour o2) {
			return o1.getPrice() - o2.getPrice();
		}		
	};
	

}
