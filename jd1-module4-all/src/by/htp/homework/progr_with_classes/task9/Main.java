package by.htp.homework.progr_with_classes.task9;

public class Main {

	public static void main(String[] args) {

		// Создать класс Book (id, название, автор(ы), издательство, год идания,
		// кол. страниц, цена, тип переплета). Определить конструкторы, set-, get- и
		// метод toString. Создать второй класс, агрегирующий массив типа Book, с
		// подходящими конструкторами и методами. Задать критерии выбора данных и
		// вывести эти данные на консоль.
		// Найти и вывести список книг заданного автора; список книг заданного
		// издательства; список книг, выпущенных после заданного года

		Library library = new Library();
		Library selectedLibrary;
		LibraryLogic select = new LibraryLogic();
		String author = "Patrick Rothfuss";
		String publishingHouse = "Эксмо";
		int launch = 2011;

		View console = new View();

		library.add(new Book(1001, "The Name of the Wind", "Patrick Rothfuss", "librusec.pro", 2007, 600, "solid"));
		library.add(new Book(2201, "The Wise Man's Fear", "Patrick Rothfuss", "librusec.pro", 2012, 550, "solid"));
		library.add(new Book(3303, "Геральд", "Анджей Сапковский", "Internet", 2015, 450, "soft"));
		library.add(new Book(2091, "Head First Java", "Kathy Sierra, Bert Bates", "Эксмо", 2012, 598, 60, "soft"));

		console.printFirstStep(library);

		selectedLibrary = select.authorSelection(library, author);
		console.printAuthorSelection(selectedLibrary, author);

		selectedLibrary = select.publishingHouseSelection(library, publishingHouse);
		console.printPublishingHouseSelection(selectedLibrary, publishingHouse);

		selectedLibrary = select.launchSelection(library, launch, 2020);
		console.printLaunchSelection(selectedLibrary, launch);
	}

}
