package by.htp.homework.progr_with_classes.task8;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int numCreditCard;
	private int numBankAccount;

	public Customer() {
	};

	public Customer(int id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public Customer(int id, String surname, String name, String patronymic, String address, int numCreditCard,
			int numBankAccount) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.numCreditCard = numCreditCard;
		this.numBankAccount = numBankAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumCreditCard() {
		return numCreditCard;
	}

	public void setNumCreditCard(int numCreditCard) {
		this.numCreditCard = numCreditCard;
	}

	public int getNumBankAccount() {
		return numBankAccount;
	}

	public void setNumBankAccount(int numBankAccount) {
		this.numBankAccount = numBankAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numBankAccount;
		result = prime * result + numCreditCard;
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numBankAccount != other.numBankAccount)
			return false;
		if (numCreditCard != other.numCreditCard)
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", numCreditCard=" + numCreditCard + ", numBankAccount=" + numBankAccount
				+ "]";
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Comparator<Customer> SurnameComparator = new Comparator<Customer>() {

		@Override
		public int compare(Customer o1, Customer o2) {
			// TODO Auto-generated method stub
			return o1.getSurname().compareTo(o2.getSurname());
		}
	};
}
