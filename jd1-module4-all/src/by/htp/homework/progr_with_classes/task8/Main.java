package by.htp.homework.progr_with_classes.task8;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		// Создать класс Customer (id, фамилия, имя, отчество, адрес, номер кредитной
		// карточки, номер банковского счета). Определить конструкторы, set-, get- и
		// метод toString. Создать второй класс, агрегирующий массив типа Customer, с
		// подходящими конструкторами и методами. Задать критерии выбора данных и
		// вывести эти данные на консоль.
		// Найти и вывести список покупателей в алфавитном порядке, список покупателей,
		// у которых номер кредитной карточки находится в определенном диапазоне

		FlowerCustomer customers = new FlowerCustomer();
		FlowerCustomer selectedCustomers;
		FlowerCustomerLogic select = new FlowerCustomerLogic();

		View console = new View();

		customers.add(new Customer(1001, "Ivanov", "Ivan", "Ivanovich", "Lenina 42", 100001, 1111111));
		customers.add(new Customer(1005, "Petrov", "Peter", "Petrovich", "Belova 11", 100222, 1112222));
		customers.add(new Customer(1002, "Andreev", "Andrey", "Andreevich", "Stalina 95", 100333, 1113333));

		console.printFirstStep(customers);

		Collections.sort(customers.getList(), Customer.SurnameComparator);
		console.printSecondStep(customers);

		selectedCustomers = select.creditCardSelection(customers, 100200, 100350);
		console.printSelection(selectedCustomers);
	}

}
