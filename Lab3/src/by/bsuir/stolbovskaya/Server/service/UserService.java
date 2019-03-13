package by.bsuir.stolbovskaya.Server.service;

import by.bsuir.stolbovskaya.Server.domain.User;
import by.bsuir.stolbovskaya.Server.service.exception.ServiceException;

public interface UserService {
	
	boolean register(User user) throws ServiceException;
	User login(String login, String password) throws ServiceException;
}
