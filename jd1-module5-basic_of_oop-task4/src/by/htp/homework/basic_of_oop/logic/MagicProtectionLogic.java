package by.htp.homework.basic_of_oop.logic;

import by.htp.homework.basic_of_oop.bean.Treasure;

public class MagicProtectionLogic extends TreasureLogic {

	public MagicProtectionLogic() {
	}

	public String use(Treasure protection) {
		if (protection.getMagicPower() > 2 && protection.getQuality() > 0) {
			protection.setMagicPower(protection.getMagicPower() - 3);
			protection.setQuality(protection.getQuality() - 1);
			return "You created the first level shield!";
		} else {
			return "You failed!";
		}

	}
}
