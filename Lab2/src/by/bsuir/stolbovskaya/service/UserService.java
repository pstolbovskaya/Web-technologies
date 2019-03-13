package by.bsuir.stolbovskaya.service;

import by.bsuir.stolbovskaya.domain.User;
import by.bsuir.stolbovskaya.service.exception.ServiceException;

import java.util.List;

public interface UserService {
	
	boolean register(User user) throws ServiceException;
	boolean login(String login, String password) throws ServiceException;
	List<User> getAll() throws ServiceException;
}
