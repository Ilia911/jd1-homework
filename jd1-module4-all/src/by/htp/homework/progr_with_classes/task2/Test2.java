package by.htp.homework.progr_with_classes.task2;

public class Test2 {
	
	private double num1;
	private double num2;
	
	public Test2() {
		this.num1 = 1;
		this.num2 = 2;
	}
	public Test2 (double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum1() {
		return this.num1;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getNum2() {
		return this.num2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(num1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(num2);
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
		Test2 other = (Test2) obj;
		if (Double.doubleToLongBits(num1) != Double.doubleToLongBits(other.num1))
			return false;
		if (Double.doubleToLongBits(num2) != Double.doubleToLongBits(other.num2))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Test2 [num1=" + num1 + ", num2=" + num2 + "]";
	}
	

}
