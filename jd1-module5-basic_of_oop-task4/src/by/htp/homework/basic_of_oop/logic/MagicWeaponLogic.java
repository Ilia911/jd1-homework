package by.htp.homework.basic_of_oop.logic;

import by.htp.homework.basic_of_oop.bean.Treasure;

public class MagicWeaponLogic extends TreasureLogic {

	public MagicWeaponLogic() {
	}

	public String use(Treasure weapon) {
		if (weapon.getMagicPower() > 1 && weapon.getQuality() > 0) {
			weapon.setMagicPower(weapon.getMagicPower() - 2);
			weapon.setQuality(weapon.getQuality() - 1);
			return "You made a hit!";
		} else {
			return "You failed!";
		}

	}

}
