package by.htp.homework.agregation.task2;

public class Engine {
	
	private String code;
	private String maker;
	private int price;
	
	public Engine () {
		this.code = "Unknown";
		this.maker = "Unknown";
		this.price = 0;
	};
	public Engine (String maker, String code,  int price) {
		this.code = code;
		this.maker = maker;
		this.price = price;
	}
	public String getMaker() {
		return this.maker;
		}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + price;
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
		Engine other = (Engine) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (maker == null) {
			if (other.maker != null)
				return false;
		} else if (!maker.equals(other.maker))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Engine [code=" + code + ", maker=" + maker + ", price=" + price + "]";
	}

}
