package by.bsuir.stolbovskaya.service;

import by.bsuir.stolbovskaya.service.exception.ServiceException;

public interface EncodingService {
    String getHash(String str) throws ServiceException;
}
