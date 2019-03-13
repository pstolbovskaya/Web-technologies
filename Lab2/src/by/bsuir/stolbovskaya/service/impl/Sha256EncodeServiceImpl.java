package by.bsuir.stolbovskaya.service.impl;

import by.bsuir.stolbovskaya.service.EncodingService;
import by.bsuir.stolbovskaya.service.exception.ServiceException;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256EncodeServiceImpl implements EncodingService {

    @Override
    public String getHash(String str) throws ServiceException {
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            sha256.update(str.getBytes(), 0, str.length());
            return DatatypeConverter.printHexBinary(sha256.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new ServiceException("Password encoding fails.", e);
        }
    }
}