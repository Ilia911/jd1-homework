package by.htp.homework.basic_of_oop.bean;

public abstract class MagicTreasure extends Treasure {

	// этот класс также будет базовым для разных классов магических сокровищ (оружие
	// и защита)
	// в нем только определим общий для всех магических сокровищ метод estimate()

	public MagicTreasure() {
	};

	public MagicTreasure(int price, int quality) {
		super(price, quality);
	}

	@Override
	public void estimate() {
		setPrice(getQuality() * 10 + getMagicPower() * 50);

	}

}
