package by.htp.homework.progr_with_classes.task5;

public class Counter {

	private int count;
	private int minCount;
	private int maxCount;

	public Counter() {
		this.count = 0;
		this.minCount = -50;
		this.maxCount = 50;
	}

	public Counter(int count, int minCount, int maxCount) {

		if (minCount > maxCount) {
			int temp = maxCount;
			maxCount = minCount;
			minCount = temp;
		}
		if (count > maxCount || count < minCount) {
			count = (maxCount + minCount) / 2;
		}
		this.count = count;
		this.minCount = minCount;
		this.maxCount = maxCount;
	}

	public void add() {
		this.count++;
		if (this.count > this.maxCount) {
			this.count = this.minCount;
		}
	}

	public void subtract() {
		this.count--;
		if (this.count < this.minCount) {
			this.count = this.maxCount;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMinCount() {
		return minCount;
	}

	public void setMinCount(int minCount) {
		this.minCount = minCount;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + maxCount;
		result = prime * result + minCount;
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
		Counter other = (Counter) obj;
		if (count != other.count)
			return false;
		if (maxCount != other.maxCount)
			return false;
		if (minCount != other.minCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Counter [count=" + count + ", minCount=" + minCount + ", maxCount=" + maxCount + "]";
	}

}
