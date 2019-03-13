package by.bsuir.stolbovskaya.Server.service;

import by.bsuir.stolbovskaya.Server.service.exception.ServiceException;

public interface EncodingService {
    String getHash(String str) throws ServiceException;
}
