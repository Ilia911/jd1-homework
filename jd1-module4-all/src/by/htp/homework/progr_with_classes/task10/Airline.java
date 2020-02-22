package by.htp.homework.progr_with_classes.task10;

public class Airline {
	
	private String destinition;
	private int flightNum;
	private String type;
	private String depatureTime;
	private String weekDay;

	public Airline() {}
	
	public Airline (String destinition, int flightNum, String type, String depatureTime, String weekDay) {
		this.destinition = destinition;
		this.flightNum = flightNum;
		this.type = type;
		this.depatureTime = depatureTime;
		this.weekDay = weekDay;
		
	}

	public String getDestinition() {
		return destinition;
	}

	public void setDestinition(String destinition) {
		this.destinition = destinition;
	}

	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depatureTime == null) ? 0 : depatureTime.hashCode());
		result = prime * result + ((destinition == null) ? 0 : destinition.hashCode());
		result = prime * result + flightNum;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((weekDay == null) ? 0 : weekDay.hashCode());
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
		Airline other = (Airline) obj;
		if (depatureTime == null) {
			if (other.depatureTime != null)
				return false;
		} else if (!depatureTime.equals(other.depatureTime))
			return false;
		if (destinition == null) {
			if (other.destinition != null)
				return false;
		} else if (!destinition.equals(other.destinition))
			return false;
		if (flightNum != other.flightNum)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (weekDay == null) {
			if (other.weekDay != null)
				return false;
		} else if (!weekDay.equals(other.weekDay))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destinition=" + destinition + ", flightNum=" + flightNum + ", type=" + type + ", depatureTime="
				+ depatureTime + ", weekDay=" + weekDay + "]";
	}
	
}
