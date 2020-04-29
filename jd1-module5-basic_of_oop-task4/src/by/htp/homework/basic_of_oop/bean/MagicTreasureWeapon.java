package by.htp.homework.basic_of_oop.bean;

public final class MagicTreasureWeapon extends MagicTreasure {

	// Здесь я использую модификатор final для того чтобы показать что это конечный
	// класс (хотя мы понимаем что можно еще расширить данный класс химическим,
	// биологическим, радиоактивным и т.д. оружием)

	{
		this.setNote("Magic weapon");
	}

	public MagicTreasureWeapon() {
	}

	public MagicTreasureWeapon(int price, int quality) {
		super(price, quality);

	}

	public MagicTreasureWeapon(int price, int quality, String note, int magicPower, boolean isActive) {
		this.setPrice(price);
		this.setQuality(quality);
		this.setNote(note);
		this.setMagicPower(magicPower);
		this.setIsActive(isActive);

	}

	@Override
	public void upgrade(int mana, int skillLevel) {

		this.setQuality(this.getQuality() + mana * skillLevel / 150);

	}

}
