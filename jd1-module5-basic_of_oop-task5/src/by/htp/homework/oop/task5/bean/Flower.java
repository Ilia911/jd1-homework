package by.htp.homework.oop.task5.bean;

public class Flower extends FlowerCompositionElement {

	private int quality;

	public Flower() {
	}

	public Flower(String name, int price) {
		super(name, price);
	}

	public Flower(String name, int price, int quality) {
		super(name, price);
		this.quality = quality;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + quality;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		if (quality != other.quality)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flower [quality=" + quality + "]";
	}

}
