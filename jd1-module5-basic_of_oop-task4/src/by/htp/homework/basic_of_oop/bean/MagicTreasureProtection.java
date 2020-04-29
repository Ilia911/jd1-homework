package by.htp.homework.basic_of_oop.bean;

public class MagicTreasureProtection extends MagicTreasure {

	{
		this.setNote("Magic protection");
	}

	public MagicTreasureProtection() {
	}

	public MagicTreasureProtection(int price, int quality) {
		super(price, quality);

	}

	public MagicTreasureProtection(int price, int quality, String note, int magicPower, boolean isActive) {
		this.setPrice(price);
		this.setQuality(quality);
		this.setNote(note);
		this.setMagicPower(magicPower);
		this.setIsActive(isActive);

	}

	@Override
	public void upgrade(int mana, int skillLevel) {

		this.setQuality(this.getQuality() + mana * skillLevel / 100);

	}

}
