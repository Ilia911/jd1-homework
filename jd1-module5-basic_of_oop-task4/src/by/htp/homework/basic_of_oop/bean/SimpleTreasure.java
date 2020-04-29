package by.htp.homework.basic_of_oop.bean;

public class SimpleTreasure extends Treasure {

	public SimpleTreasure() {
	}

	public SimpleTreasure(int price, int quality) {
		this.setPrice(price);
		this.setQuality(quality);
	}

	public SimpleTreasure(int price, int quality, String note) {
		this(price, quality);
		this.setNote(note);
	}

	@Override
	public void estimate() {

		setPrice(getQuality() * 10);

	}

}
