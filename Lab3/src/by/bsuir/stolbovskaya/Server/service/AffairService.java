package by.bsuir.stolbovskaya.Server.service;

import by.bsuir.stolbovskaya.Server.domain.Affair;
import by.bsuir.stolbovskaya.Server.domain.AffairArchive;
import by.bsuir.stolbovskaya.Server.service.exception.ServiceException;

public interface AffairService {
    Affair getAffairById(int id) throws ServiceException;

    void addAffair(Affair Affair) throws ServiceException;

    void updateAffairById(int id, Affair Affair) throws ServiceException;

    void deleteAffairById(int id) throws ServiceException;

    AffairArchive getAll() throws ServiceException;
}
