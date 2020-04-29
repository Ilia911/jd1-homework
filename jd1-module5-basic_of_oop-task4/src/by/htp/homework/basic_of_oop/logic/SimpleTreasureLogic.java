package by.htp.homework.basic_of_oop.logic;

import by.htp.homework.basic_of_oop.bean.Treasure;

public class SimpleTreasureLogic extends TreasureLogic {

	public SimpleTreasureLogic() {
	}

	public String use(Treasure simpleTreasure) {

		return "You can't use this treasure! Just look at it!";
	}

}
