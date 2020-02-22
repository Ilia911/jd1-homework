package by.htp.homework.agregation.task3;

public class Main {

	public static void main(String[] args) {

		// Создать объект Государство, используя классы Область, Город, Район. Методы:
		// вывести на консоль столицу, количество областей, площадь, областные центры

		// Изучив административное деление Республики Беларусь, решил что данная задача
		// никак не связана с ним. А является учебными вариантом.
		// Принимаем вариант: Город входит в состав Района, Район в состав Государства
		
		int countDistrict;
		
		City city1 = new City("Krupki", "town", 8500, 25.5, -50);
		Region region1 = new Region(city1, 15000, 250.5, -90);
		
		City city2 = new City("Borisov", "town", 85000, 276.51, 250);
		City city3 = new City("Berezino", "locality", 1500, 276.51, -50);
		Region region2 = new Region(city2, 250000, 500, -150);
		region2.add(city3);
		
		City city4 = new City("Minsk", "capital", 2100000, 250.9, 5000000);
		Region region3 = new Region(city4, 300000, 250.5, 1000000);
		
		District district1 = new District();
		district1.add(region1);
		district1.add(region2);
		district1.add(region3);
		
		City city5 = new City("Brest", "city", 400000, 150, 500000);
		Region region4 = new Region(city5, 100000, 550.5, 400000);
		
		District district2 = new District();
		district2.add(region4);
		
		State state = new State("Belarus3");
		state.add(district1);
		state.add(district2);
		
		View view = new View();
		view.printCapital(state);
		
		countDistrict = state.countOfDistrict();
		view.printCountDistrict(countDistrict);
		
		view.printAreaOfState(state);
		
		view.printNameDistrict(state);

		
	}

}
