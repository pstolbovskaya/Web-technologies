package by.bsuir.stolbovskaya.Server.dao;

import by.bsuir.stolbovskaya.Server.dao.exception.DAOException;
import by.bsuir.stolbovskaya.Server.domain.User;

import java.util.List;

public interface UserDAO {

	boolean addUser(User user) throws DAOException;

	User getUserByLoginAndPassword(String login, String password) throws DAOException;
	User getUserByLogin(String login) throws DAOException;

	List<User> getAll() throws DAOException;
}
