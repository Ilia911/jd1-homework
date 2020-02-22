package by.htp.homework.progr_with_classes.task9;

public class Book implements Comparable<Book> {
	private int id;
	private String title;
	private String authors;
	private String publishingHouse;
	private int launch;
	private int numPages;
	private int price;
	private String cover;

	public Book() {
	};

	public Book(int id, String title, String authors, String publishingHouse, int launch, int numPages, String cover) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.launch = launch;
		this.numPages = numPages;
		this.cover = cover;
	}

	public Book(int id, String title, String authors, String publishingHouse, int launch, int numPages, int price,
			String cover) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.launch = launch;
		this.numPages = numPages;
		this.price = price;
		this.cover = cover;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authors=" + authors + ", publishingHouse=" + publishingHouse
				+ ", launch=" + launch + ", numPages=" + numPages + ", price=" + price + ", cover=" + cover + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + id;
		result = prime * result + launch;
		result = prime * result + numPages;
		result = prime * result + price;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (id != other.id)
			return false;
		if (launch != other.launch)
			return false;
		if (numPages != other.numPages)
			return false;
		if (price != other.price)
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getLaunch() {
		return launch;
	}

	public void setLaunch(int launch) {
		this.launch = launch;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	@Override
	public int compareTo(Book o) {
		return this.id - o.getId();
	}

}
