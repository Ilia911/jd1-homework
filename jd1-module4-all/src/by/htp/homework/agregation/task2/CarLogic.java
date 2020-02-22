package by.htp.homework.agregation.task2;

public class CarLogic {

	public void wheelReplace(Car car, int indexOldWheel, Wheel newWheel) {
		car.getWheelSet().remove(indexOldWheel);
		car.getWheelSet().add(indexOldWheel, newWheel);
	}

}
