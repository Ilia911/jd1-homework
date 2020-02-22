package by.htp.homework.progr_with_classes.task4;

import java.util.Calendar;

public class Train implements Comparable<Train> {

	private String destination;
	private int numTrain;
	private Calendar departuelTime;

	public Train() {
	}

	public Train(String destination, int numTrain) {
		this.destination = destination;
		this.numTrain = numTrain;
	}

	public Train(String destination, int numTrain, Calendar departialTime) {
		this.destination = destination;
		this.numTrain = numTrain;
		this.departuelTime = departialTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumTrain() {
		return numTrain;
	}

	public void setNumTrain(int numTrain) {
		this.numTrain = numTrain;
	}

	public Calendar getDepartuelTime() {
		return departuelTime;
	}

	public void setDepartuelTime(Calendar departuelTime) {
		this.departuelTime = departuelTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departuelTime == null) ? 0 : departuelTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numTrain;
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
		Train other = (Train) obj;
		if (departuelTime == null) {
			if (other.departuelTime != null)
				return false;
		} else if (!departuelTime.equals(other.departuelTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numTrain != other.numTrain)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", numTrain=" + numTrain + ", departuelTime=" + departuelTime
				+ "]";
	}

	@Override
	public int compareTo(Train o) {
		// TODO Auto-generated method stub
		return (this.numTrain - o.numTrain);
	}

}
