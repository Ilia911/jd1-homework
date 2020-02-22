package by.htp.homework.agregation.task5;

public class View {
	
	public void print(Offer offer) {
		System.out.println("Selected offer:");
		for(Tour t : offer.getList()) {
		System.out.println(t.toString());
		}
		System.out.println("");
	}

}
