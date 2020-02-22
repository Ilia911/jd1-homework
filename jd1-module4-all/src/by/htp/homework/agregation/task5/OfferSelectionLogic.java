package by.htp.homework.agregation.task5;

public class OfferSelectionLogic {
	
	public Offer selectOfferByEnum(Offer offer, Transportation transport) {
		Offer newOffer = new Offer();
		newOffer.setType(offer.getType());
		
		for (Tour t : offer.getList()) {
			if (transport == t.getTransport()) {
				newOffer.add(t);
			}
		}		
		return newOffer;
	}
	
	public Offer selectOfferByEnum(Offer offer, TourType type) {
		Offer newOffer = new Offer();
		newOffer.setType(offer.getType());
		
		for (Tour t : offer.getList()) {
			if (type == t.getType()) {
				newOffer.add(t);
			}
		}		
		return newOffer;
	}
	
	public Offer selectOfferByEnum(Offer offer, Food food) {
		Offer newOffer = new Offer();
		newOffer.setType(offer.getType());
		
		for (Tour t : offer.getList()) {
			if (food == t.getFood()) {
				newOffer.add(t);
			}
		}		
		return newOffer;
	}
	
	public Offer selectOfferByEnum(Offer offer, Destinition parametr) {
		Offer newOffer = new Offer();
		newOffer.setType(offer.getType());
		
		for (Tour t : offer.getList()) {
			if (parametr == t.getDestinition()) {
				newOffer.add(t);
			}
		}		
		return newOffer;
	}
	
	public Offer selectOfferByNumNight(Offer offer, int minNum, int maxNum) {
		Offer newOffer = new Offer();
		newOffer.setType(offer.getType());
		
		for (Tour t : offer.getList()) {
			if (t.getNumNights() > minNum && t.getNumNights() < maxNum) {
				newOffer.add(t);
			}
		}		
		return newOffer;
	}
	
	public Offer selectOfferByPrice(Offer offer, int minCost, int maxCost) {
		Offer newOffer = new Offer();
		newOffer.setType(offer.getType());
		
		for (Tour t : offer.getList()) {
			if (t.getPrice() >= minCost && t.getPrice() <= maxCost) {
				newOffer.add(t);
			}
		}		
		return newOffer;
	}

}
