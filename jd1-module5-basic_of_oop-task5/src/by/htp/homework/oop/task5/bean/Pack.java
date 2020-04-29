package by.htp.homework.oop.task5.bean;

public class Pack extends FlowerCompositionElement {

	private PackType type;

	public Pack() {
	}

	public Pack(PackType type, int price) {
		this.type = type;
		super.setPrice(price);

	}

	public PackType getType() {
		return type;
	}

	public void setType(PackType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pack other = (Pack) obj;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pack [type=" + type + ", toString()=" + super.toString() + "]";
	}
}
