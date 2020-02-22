package by.htp.homework.agregation.task5;

import java.util.Collections;


public class Main {

	public static void main(String[] args) {

		// Туристические путевки. Сформировать набор предложений клиенту по выбору
		// туристической путевки различного вида (отдых, экскурсии, лечение, шопинг,
		// круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
		// транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
		
		OfferSelectionLogic selectLogic = new OfferSelectionLogic(); // Объект для вызова на нем логики
		Offer selectOffer = new Offer();
		View print = new View();
		Offer allOffer = new Offer(OfferType.MIDDLE);
		
		// Создаем тестовое общее предложение путевок
		
		allOffer.add(new Tour(10001, TourType.REST, Transportation.BY_PLAIN, Food.ALL_INCLUSIVE, 
				Destinition.PARIS, 9, 2500));
		allOffer.add(new Tour(10002, TourType.EXCURSION, Transportation.BY_PLAIN, Food.ALL_INCLUSIVE, 
				Destinition.MOSCKOW, 7, 2000));
		allOffer.add(new Tour(10000, TourType.TREATMENT, Transportation.BY_TRAIN, Food.ALL_INCLUSIVE, 
				Destinition.KRUPKI, 14, 1500));
		allOffer.add(new Tour(10005, TourType.WALKING, Transportation.ON_FOOT, Food.ABSENT, 
				Destinition.FEODOSIA, 4, 500));
		allOffer.add(new Tour(10004, TourType.EXCURSION, Transportation.BY_PLAIN, Food.BREAKFAST_AND_LUNCH, 
				Destinition.PARIS, 5, 1500));
		
		// Отсортировать предложение можно по цене ByPrice, по количеству ночей ByNumNights, по id ById 
		Collections.sort(allOffer.getList(), Tour.ByPrice);
		
		// Методы выборки перегружены по всем Enum-параметрам
		selectOffer = selectLogic.selectOfferByEnum(allOffer, TourType.REST);		
		print.print(selectOffer);
		
		// Выборка по условиям цены и количества ночей проводится исходя из min и max значения данных параметров
		selectOffer = selectLogic.selectOfferByPrice(allOffer, 1500, 2000);		
		print.print(selectOffer);
		
		selectOffer = selectLogic.selectOfferByNumNight(allOffer, 6, 10);		
		print.print(selectOffer);
		
	}
	

}
