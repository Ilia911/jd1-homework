package by.htp.homework.agregation.task2;

public class View {
	
	public void printResult(Car car) {
		System.out.println("Car maker: " + car.getMaker());
		System.out.println(car.getWheelSet().toString());
		System.out.println("Current fuel level - " + car.getCurrentFuel());
		System.out.println("Mileage - " + car.getMileage());
	}

}
