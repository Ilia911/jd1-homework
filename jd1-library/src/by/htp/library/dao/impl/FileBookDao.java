package by.htp.library.dao.impl;

import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDAOException;
import by.htp.library.dao.BookDao;

public class FileBookDao implements BookDao {

	@Override
	public boolean add(Book book) {
		// Открыть файл, присвоить id, сформировать строчку с информацией о книге,
		// сделать новую запись в файле
		// Если все хорошо, то вернуть true
		return false;
	}

	@Override
	public List<Book> findByTitle(String title) throws BookDAOException{
		// TODO Auto-generated method stub
		return null;
	}

}
