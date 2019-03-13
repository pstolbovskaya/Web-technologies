package by.bsuir.stolbovskaya.service;

import by.bsuir.stolbovskaya.domain.Book;
import by.bsuir.stolbovskaya.service.exception.ServiceException;

import java.util.List;

public interface BookService {
	boolean addBook(Book book) throws ServiceException;
	Book getBook(String title, String author, Book.Type type) throws ServiceException;
	boolean deleteBook(String title, String author, Book.Type type) throws ServiceException;

	List<Book> getAll() throws ServiceException;
	List<Book> getBooksByTitle(String title) throws ServiceException;
	List<Book> getBooksByAuthor(String author) throws ServiceException;
	List<Book> getBooksByType(Book.Type type) throws ServiceException;
}
