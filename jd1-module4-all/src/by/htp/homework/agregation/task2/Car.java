package by.htp.homework.agregation.task2;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private Engine engine;
	private List<Wheel> wheelSet;

	private String maker;
	private int mileage;
	private int maxCountFuel;
	private int currentFuel;

	{
		this.mileage = 0;
		this.currentFuel = 0;
		this.maxCountFuel = 60;
	}

	public Car() {
		this.engine = new Engine();
		this.wheelSet = new ArrayList<Wheel>();
		this.maker = "Unknown";
	};

	public Car(String maker, Engine engine, List<Wheel> wheelSet, int maxCountFuel) {
		this.engine = engine;
		this.wheelSet = wheelSet;
		this.maker = maker;
		this.maxCountFuel = maxCountFuel;
	}
	public Car(String maker, Engine engine, List<Wheel> wheelSet, int mileage, int maxCountFuel, int currentFuel) {
		this.engine = engine;
		this.wheelSet = wheelSet;
		this.maker = maker;
		this.mileage = mileage;
		this.maxCountFuel = maxCountFuel;
		this.currentFuel = currentFuel;
	}
	public void refuel(int fuelCount) {
		this.currentFuel = this.currentFuel + fuelCount;
		if (currentFuel > maxCountFuel) {
			currentFuel = maxCountFuel;
		}
	}
	public void move(int distance) {
		if(distance*5/100 <= currentFuel) {
			currentFuel -= distance*5/100; // Принимаем расход топлива 5 л/100км
			mileage += distance;
		} else {
			mileage = mileage + currentFuel*100/5;
			currentFuel = 0;
		}
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Wheel> getWheelSet() {
		return wheelSet;
	}

	public void setWheelSet(List<Wheel> wheelSet) {
		this.wheelSet = wheelSet;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getMaxCountFuel() {
		return maxCountFuel;
	}

	public void setMaxCountFuel(int maxCountFuel) {
		this.maxCountFuel = maxCountFuel;
	}

	public int getCurrentFuel() {
		return currentFuel;
	}

	public void setCurrentFuel(int currentFuel) {
		this.currentFuel = currentFuel;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheelSet=" + wheelSet + ", maker=" + maker + ", mileage=" + mileage
				+ ", maxCountFuel=" + maxCountFuel + ", currentFuel=" + currentFuel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentFuel;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + maxCountFuel;
		result = prime * result + mileage;
		result = prime * result + ((wheelSet == null) ? 0 : wheelSet.hashCode());
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
		Car other = (Car) obj;
		if (currentFuel != other.currentFuel)
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (maker == null) {
			if (other.maker != null)
				return false;
		} else if (!maker.equals(other.maker))
			return false;
		if (maxCountFuel != other.maxCountFuel)
			return false;
		if (mileage != other.mileage)
			return false;
		if (wheelSet == null) {
			if (other.wheelSet != null)
				return false;
		} else if (!wheelSet.equals(other.wheelSet))
			return false;
		return true;
	}
	

}
