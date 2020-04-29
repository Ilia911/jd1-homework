package by.htp.homework.oop.task5.service.impl;

import by.htp.homework.oop.task5.bean.FlowerComposition;
import by.htp.homework.oop.task5.service.FlowerCompositionService;
import by.htp.homework.oop.task5.service.FlowerService;

public class FlowerCompositionServiceImpl implements FlowerCompositionService {

	@Override
	public int sum(FlowerComposition flowerComposition) {
		int sum = 0;
		for (FlowerService flower : flowerComposition.getList()) {
			sum += flower.getPrice();
		}
		sum += flowerComposition.getPack().getPrice();
		return sum;
	}

	@Override
	public int flowerQuantity(FlowerComposition flowerComposition) {

		return flowerComposition.getList().size();
	}

}
