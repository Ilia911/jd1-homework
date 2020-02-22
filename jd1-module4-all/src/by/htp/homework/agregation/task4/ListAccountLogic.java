package by.htp.homework.agregation.task4;

public class ListAccountLogic {

	public Account selectAccount(Client client, int idAccount) {
		Account account = null;
		for (Account ac : client.getList()) {
			if (ac.getId() == idAccount) {
				account = ac;
				break;
			}
		}
		return account;
	}

	public double sumCount(Client client) {
		double sumCount;
		sumCount = 0;

		for (Account ac : client.getList()) {
			sumCount += ac.getSum();
		}
		return sumCount;
	}

	public double sumPositiveCount(Client client) {
		double sumCount;
		sumCount = 0;

		for (Account ac : client.getList()) {
			if (ac.getSum() > 0) {
				sumCount += ac.getSum();
			}
		}
		return sumCount;
	}

	public double sumNegativeCount(Client client) {
		double sumCount;
		sumCount = 0;

		for (Account ac : client.getList()) {
			if (ac.getSum() < 0) {
				sumCount += ac.getSum();
			}
		}
		return sumCount;
	}

}
