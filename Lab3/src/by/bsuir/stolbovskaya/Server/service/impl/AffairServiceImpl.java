package by.bsuir.stolbovskaya.Server.service.impl;

import by.bsuir.stolbovskaya.Server.dao.DAOFactory;
import by.bsuir.stolbovskaya.Server.dao.exception.DAOException;
import by.bsuir.stolbovskaya.Server.domain.Affair;
import by.bsuir.stolbovskaya.Server.domain.AffairArchive;
import by.bsuir.stolbovskaya.Server.service.AffairService;
import by.bsuir.stolbovskaya.Server.service.exception.ServiceException;

public class AffairServiceImpl implements AffairService {
    
    @Override
    public Affair getAffairById(int id) throws ServiceException {
        if (id < 0) {
            throw new ServiceException("Id can't be negative.");
        }

        try {
            return DAOFactory.getInstance().getAffairDAO().getAffairById(id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void addAffair(Affair Affair) throws ServiceException {
        try {
            if (DAOFactory.getInstance().getAffairDAO().getAffairById(Affair.getId()) != null) {
                throw new ServiceException("Such Affair already exists.");
            }

            DAOFactory.getInstance().getAffairDAO().addAffair(Affair);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

    }

    @Override
    public void updateAffairById(int id, Affair Affair) throws ServiceException {
        try {
            if (id != Affair.getId()) {
                throw new ServiceException("IDs are not the same.");
            }

            if (DAOFactory.getInstance().getAffairDAO().getAffairById(id) == null) {
                throw new ServiceException("Such Affair doesn't exists.");
            }

            DAOFactory.getInstance().getAffairDAO().updateAffairById(id, Affair);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void deleteAffairById(int id) throws ServiceException {
        try {
            if (DAOFactory.getInstance().getAffairDAO().getAffairById(id) == null) {
                throw new ServiceException("Such Affair doesn't exist.");
            }

            DAOFactory.getInstance().getAffairDAO().deleteAffairById(id);
        }
        catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public AffairArchive getAll() throws ServiceException {
        try {
            return DAOFactory.getInstance().getAffairDAO().getAll();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
