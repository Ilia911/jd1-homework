package by.htp.homework.progr_with_classes.task8;

public class FlowerCustomerLogic {

	FlowerCustomer creditCardSelection(FlowerCustomer list, int startCreditCardNum, int endCreditCardNum) {
		FlowerCustomer selectedList = new FlowerCustomer();

		for (Customer cu : list.getList()) {
			if (cu.getNumCreditCard() > startCreditCardNum && cu.getNumCreditCard() < endCreditCardNum) {
				selectedList.add(cu);
			}
		}
		return selectedList;
	}
}
