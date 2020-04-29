package by.htp.homework.oop.task5.bean;

import by.htp.homework.oop.task5.service.FlowerService;

public class Tulip extends Flower implements FlowerService {

	public Tulip() {		
	}
	
	public Tulip(String name, int price) {
		super(name,price);
	}
	
	public Tulip(String name, int price, int quality) {
		super(name,price,quality);
	}
	
	public int getPrice() {		
		return super.getPrice();
	}
	
	public boolean cut() {
		if (super.getPrice() > 3) {
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
