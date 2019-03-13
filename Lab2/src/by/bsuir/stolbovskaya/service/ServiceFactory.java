package by.bsuir.stolbovskaya.service;

import by.bsuir.stolbovskaya.service.impl.BookServiceImpl;
import by.bsuir.stolbovskaya.service.impl.UserServiceImpl;

import by.bsuir.stolbovskaya.domain.User;

public class ServiceFactory {

	private static final ServiceFactory factory = new ServiceFactory();

	private final BookService bookService = new BookServiceImpl();
	private final UserService userService = new UserServiceImpl();
	private User currentUser;

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return factory;
	}

	public BookService getBookService() {
		if (currentUser != null)
		{
			return bookService;
		}

		return null;
	}
	public UserService getUserService() {
		return userService;
	}

	public User getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(User user) {
		this.currentUser = user;
	}
}
