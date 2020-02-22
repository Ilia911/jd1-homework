package by.htp.homework.agregation.task4;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
		// блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
		// Вычисление общей суммы по всем счета, имеющим положительный и отрицательный
		// балансы отдельно.

		// Создаем объект для тестирования возможностей программы

		View view = new View();
		ListAccountLogic accountLogic = new ListAccountLogic();

		Account selectedAccount;
		double sumAccounts;

		Client client = new Client("Ivanov I I", 123456);
		client.add(new Account(1111876, -500));
		client.add(new Account(2228761, 600));
		client.add(new Account(1331876, 200));
		client.add(new Account(1111000, -100));

		client.getList().get(0).block(); // блокируем один из счетов (для проверки работы)

		// Сортируем по id
		Collections.sort(client.getList(), Account.IdComparator);
		view.printListAccount(client);

		// Сортируем по сумме
		Collections.sort(client.getList(), Account.SumComparator);
		view.printListAccount(client);

		// Выбираем счет по номеру
		selectedAccount = accountLogic.selectAccount(client, 2228761);
		view.printAccount(selectedAccount);

		// Считаем суммы всех счетов; с положительным балансом; с отрицательным балансом
		sumAccounts = accountLogic.sumCount(client);
		view.printSumCount(sumAccounts);

		sumAccounts = accountLogic.sumPositiveCount(client);
		view.printSumPositiveCount(sumAccounts);

		sumAccounts = accountLogic.sumNegativeCount(client);
		view.printSumNegativeCount(sumAccounts);

	}

}
