package by.ilyacoding.servicehotels.dao;

import by.ilyacoding.servicehotels.bean.Entity;

import java.sql.SQLException;
import java.util.List;

public interface AbstractDAO <T extends Entity> {
    List<T> findAll() throws SQLException;
    void createEntity(T entity) throws SQLException;
}
