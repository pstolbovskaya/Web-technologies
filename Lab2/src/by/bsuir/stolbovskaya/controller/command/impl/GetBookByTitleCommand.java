package by.bsuir.stolbovskaya.controller.command.impl;

import by.bsuir.stolbovskaya.controller.command.Command;
import by.bsuir.stolbovskaya.controller.util.BookStringBuilder;
import by.bsuir.stolbovskaya.domain.Book;
import by.bsuir.stolbovskaya.service.BookService;
import by.bsuir.stolbovskaya.service.ServiceFactory;
import by.bsuir.stolbovskaya.service.exception.ServiceException;

import java.util.List;

public class GetBookByTitleCommand implements Command {

    @Override
    public String execute(String request) {
        String[] params = request.split(";");

        if (params.length < 1) {
            return "Arguments required: 1";
        }

        try {
            BookService bookService = ServiceFactory.getInstance().getBookService();
            if (bookService == null) {
                throw new ServiceException("Access denied");
            }

            List<Book> books = bookService.getBooksByTitle(params[0]);
            if (books != null) {
                BookStringBuilder sb = new BookStringBuilder();
                return sb.buildString(books);
            }
            else {
                return "No such book";
            }
        } catch (ServiceException e) {
            return e.getMessage();
        }
    }
}
