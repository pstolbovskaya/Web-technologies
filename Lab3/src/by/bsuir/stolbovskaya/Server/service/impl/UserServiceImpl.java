package by.bsuir.stolbovskaya.Server.service.impl;

import by.bsuir.stolbovskaya.Server.dao.DAOFactory;
import by.bsuir.stolbovskaya.Server.dao.exception.DAOException;
import by.bsuir.stolbovskaya.Server.domain.User;
import by.bsuir.stolbovskaya.Server.service.EncodingService;
import by.bsuir.stolbovskaya.Server.service.UserService;
import by.bsuir.stolbovskaya.Server.service.exception.ServiceException;
import by.bsuir.stolbovskaya.Server.service.util.Validator;

public class UserServiceImpl implements UserService {

	private boolean isValid(String login, String password) throws ServiceException {
		return Validator.isLoginValid(login) && Validator.isPasswordValid(password);

	}

	@Override
	public boolean register(User user) throws ServiceException {
		if (!isValid(user.getLogin(), user.getPassword())) {
			throw new ServiceException("Wrong password, login or email");
		}
		try {
			User existingUser = DAOFactory.getInstance().getUserDAO().getUserByLogin(user.getLogin());
			if (existingUser != null) {
				return false;
			}
			else {
				EncodingService encoder = new Sha256EncodeServiceImpl();
				String password = encoder.getHash(user.getPassword());
				user.setPassword(password);
				return DAOFactory.getInstance().getUserDAO().addUser(user);
			}
		}
		catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public User login(String login, String password) throws ServiceException {
		if (!isValid(login, password)) {
			throw new ServiceException("Wrong password, login or email");
		}

		try {
			EncodingService encoder = new Sha256EncodeServiceImpl();
			String encodedPassword = encoder.getHash(password);
			return DAOFactory.getInstance().getUserDAO().getUserByLoginAndPassword(login, encodedPassword);
		}
		catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

}
