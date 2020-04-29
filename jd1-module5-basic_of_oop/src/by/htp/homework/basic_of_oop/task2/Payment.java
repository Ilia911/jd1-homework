package by.htp.homework.basic_of_oop.task2;

import java.util.ArrayList;

public class Payment {

	private static int paymentId;
	private ArrayList<Product> list;	
	private double resultSum;

	{
		paymentId++;
		list = new ArrayList<Product>();
	}

	public Payment() {
	}
	
	public Payment(int count, double price) {
		
	}

	public void add(String title, double price) {
		Product product = new Product(title, price);
		this.list.add(product);
		resultSum += price;
	}

	public void remove(int index) {
		this.resultSum -= this.list.get(index).getPrice();
		this.list.remove(index);
	}
	
	public static int getPaymentId() {
		return paymentId;
	}
	
	public ArrayList<Product> getList() {
		return list;
	}
	
	public double getResultSum() {
		return resultSum;
	}
	

	// Внутренний класс для создания позиций платежа

	@Override
	public String toString() {
		return "Payment [list=" + list + ", resultSum=" + resultSum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		long temp;
		temp = Double.doubleToLongBits(resultSum);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Payment other = (Payment) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (Double.doubleToLongBits(resultSum) != Double.doubleToLongBits(other.resultSum))
			return false;
		return true;
	}


	public class Product {

		String title;
		private double price;
		

		public Product(String title, double price) {
			this.title = title;
			this.price = price;			
		}
		
		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((title == null) ? 0 : title.hashCode());
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
			Product other = (Product) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

		@Override
		public String toString() {
			return "Product [title=" + title + ", price=" + price + "]";
		}		

		
	}

}
