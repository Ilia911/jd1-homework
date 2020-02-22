package by.htp.homework.progr_with_classes.task8;

public class View {

	void printFirstStep(FlowerCustomer customers) {
		System.out.println("Task eight. Original list of the customers:");

		for (Customer cust : customers.getList()) {
			System.out.println(cust.toString());
		}
		System.out.println("");
	}

	void printSecondStep(FlowerCustomer customers) {
		System.out.println("Sorted list of the customers:");

		for (Customer cust : customers.getList()) {
			System.out.println(cust.toString());
		}
		System.out.println("");
	}

	void printSelection(FlowerCustomer customers) {
		System.out.println("Selected list of the customers:");

		for (Customer cust : customers.getList()) {
			System.out.println(
					cust.getSurname() + " " + cust.getName() + " num of credit card: " + cust.getNumCreditCard());
		}
		System.out.println("");
	}

}
