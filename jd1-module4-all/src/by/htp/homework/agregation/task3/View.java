package by.htp.homework.agregation.task3;

public class View {
	
	public void printCapital(State state) {
		System.out.println("Capital is " + state.getCapital());
	}
	public void printCountDistrict(int count) {
		System.out.println("Count of district - " + count);
	}
	public void printAreaOfState(State state) {
		System.out.println("The area of the state " + state.getName() + " is " + state.getArea() + " km2");
	}
	public void printNameDistrict(State state) {
		System.out.println("Names of the districts:");
		for (District district : state.getList()) {
			System.out.println(district.getName());
		}
		
	}

}
