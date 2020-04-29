package by.htp.homework.basic_of_oop.bean;

public abstract class Treasure implements Comparable<Treasure> {
	// Это самый базовый класс
	// В целях обучения данное семейство классов имеет методы логики

	private int price;
	private int quality;
	private String note;
	private int magicPower;
	private boolean isActive;

	{

		note = "Unknown treasure";
	}

	public Treasure() {
	}

	public Treasure(int price, int quality) {
		this.price = price;
		this.quality = quality;
	}

	public void upgrade(int mana, int skillLevel) {
		// Этот метод использует ману и уровень мастерства работника для улучшения
		// качества сокровища
		// Его мы будем переопределять в классах-наследниках в целях обучения

		quality += mana * skillLevel / 100;
		price += mana * skillLevel / 100 * 10;
	}

	@Override
	public int compareTo(Treasure treasure) {

		return -this.price + treasure.getPrice();
	}

	public abstract void estimate();

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getMagicPower() {
		return magicPower;
	}

	public void setMagicPower(int magicPower) {
		this.magicPower = magicPower;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + magicPower;
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + price;
		result = prime * result + quality;
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
		Treasure other = (Treasure) obj;
		if (magicPower != other.magicPower)
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (price != other.price)
			return false;
		if (quality != other.quality)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Treasure [price=" + price + ", quality=" + quality + ", note=" + note + ", magicPower=" + magicPower
				+ "]";
	}

}
