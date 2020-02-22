package by.htp.homework.agregation.task4;

import java.util.Comparator;

public class Account {

	private final int id;
	private double sum;
	private boolean unblocked;

	{
		this.sum = 0;
		this.unblocked = true;
	}

	public Account(int id) {
		this.id = id;
	}

	public Account(int id, double sum) {
		this.id = id;
		this.sum = sum;
	}

	public void add(double count) {
		this.sum += count;
	}

	public void subtract(double count) {
		this.sum -= count;
	}

	public void block() {
		this.unblocked = false;
	}

	public void unblock() {
		this.unblocked = true;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public boolean isUnblock() {
		return unblocked;
	}

	public void setUnblock(boolean unblock) {
		this.unblocked = unblock;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(sum);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (unblocked ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(sum) != Double.doubleToLongBits(other.sum))
			return false;
		if (unblocked != other.unblocked)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", sum=" + sum + ", unblocked=" + unblocked + "]";
	}

	public static Comparator<Account> IdComparator = new Comparator<Account>() {

		@Override
		public int compare(Account o1, Account o2) {
			return o1.getId() - o2.getId();
		}
	};
	public static Comparator<Account> SumComparator = new Comparator<Account>() {

		@Override
		public int compare(Account o1, Account o2) {
			return (int) (o1.getSum() * 100 - o2.getSum() * 100);
		}
	};

}
