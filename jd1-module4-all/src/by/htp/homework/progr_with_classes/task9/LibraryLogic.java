package by.htp.homework.progr_with_classes.task9;

public class LibraryLogic {

	Library authorSelection(Library list, String author) {

		Library selectedList = new Library();

		for (Book book : list.getList()) {
			if (book.getAuthors().equals(author)) {
				selectedList.add(book);
			}
		}
		return selectedList;
	}

	Library publishingHouseSelection(Library list, String publishingHouse) {

		Library selectedList = new Library();

		for (Book book : list.getList()) {
			if (book.getPublishingHouse().equals(publishingHouse)) {
				selectedList.add(book);
			}
		}
		return selectedList;
	}

	Library launchSelection(Library list, int start, int end) {

		Library selectedList = new Library();

		for (Book book : list.getList()) {
			if (book.getLaunch() > start && book.getLaunch() <= end) {
				selectedList.add(book);
			}
		}
		return selectedList;
	}

}
