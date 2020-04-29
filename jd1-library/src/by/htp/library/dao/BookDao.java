package by.htp.library.dao;

import java.util.List;

import by.htp.library.bean.Book;

public interface BookDao {
	// Это все абстрактное описание слоя доступа к источнику данных
	// Ему неважно как и где хранятся данные
	
	boolean add(Book book) throws BookDAOException;
	
	List<Book> findByTitle(String title) throws BookDAOException;
	// далее внести все требования из sourse_notes.txt во все интерфейсы.
	// Сколько их будет и каких - решать проектировщику
	// Возможно даже создвать иерархию интерфййсов

}
