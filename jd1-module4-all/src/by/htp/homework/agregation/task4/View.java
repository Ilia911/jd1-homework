package by.htp.homework.agregation.task4;

public class View {

	public void printListAccount(Client client) {
		System.out.println("List of client's id = " + client.getId() + " accounts ");
		for (Account ac : client.getList()) {
			System.out.println(ac.toString());
		}
	}

	public void printAccount(Account account) {
		System.out.println("Selected account: ");
		System.out.println(account.toString());
	}

	public void printSumCount(double sum) {
		System.out.println("The sum of all accounts: ");
		System.out.printf("%6.2f", sum);
		System.out.println("");
	}

	public void printSumPositiveCount(double sum) {
		System.out.println("The sum of positive accounts: ");
		System.out.printf("%6.2f", sum);
		System.out.println("");
	}

	public void printSumNegativeCount(double sum) {
		System.out.println("The sum of negative accounts: ");
		System.out.printf("%6.2f", sum);
		System.out.println("");
	}

}
