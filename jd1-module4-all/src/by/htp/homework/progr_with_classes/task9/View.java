package by.htp.homework.progr_with_classes.task9;

public class View {

	void printFirstStep(Library library) {
		System.out.println("Task nine. Original list of the books:");

		for (Book book : library.getList()) {
			System.out.println(book.toString());
		}
		System.out.println("");
	}

	void printAuthorSelection(Library library, String author) {
		System.out.println("Criterion of the selection - 'author': " + author);
		System.out.println("Selected list of the books:");

		for (Book book : library.getList()) {
			System.out.println("Title: " + book.getTitle() + ", author: " + book.getAuthors());
		}
		System.out.println("");
	}

	void printPublishingHouseSelection(Library library, String publishingHouse) {
		System.out.println("Criterion of the selection - 'publishingHouse': " + publishingHouse);
		System.out.println("Selected list of the books:");

		for (Book book : library.getList()) {
			System.out.println("Title: " + book.getTitle() + ", publishingHouse: " + book.getPublishingHouse());
		}
		System.out.println("");
	}

	void printLaunchSelection(Library library, int launch) {
		System.out.println("Criterion of the selection - 'launch': " + launch);
		System.out.println("Selected list of the books:");

		for (Book book : library.getList()) {
			System.out.println("Title: " + book.getTitle() + ", launch: " + book.getLaunch());
		}
		System.out.println("");
	}

}
