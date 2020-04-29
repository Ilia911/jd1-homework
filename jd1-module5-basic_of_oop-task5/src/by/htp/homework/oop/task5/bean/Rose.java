package by.htp.homework.oop.task5.bean;

import by.htp.homework.oop.task5.service.FlowerService;

public class Rose extends Flower implements FlowerService {

	public Rose() {
	}

	public Rose(String name, int price) {
		super(name, price);
	}

	public Rose(String name, int price, int quality) {
		super(name, price, quality);
	}

	public int getPrice() {

		return super.getPrice();
	}

	public boolean cut() {
		if (super.getPrice() > 5) {
			return true;
		}
		return false;
	}

	public void upgrade() {

	}

	public String getName() {
		return super.getName();
	}
	

}
