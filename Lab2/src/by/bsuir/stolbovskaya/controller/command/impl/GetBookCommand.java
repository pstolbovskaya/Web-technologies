package by.bsuir.stolbovskaya.controller.command.impl;

import by.bsuir.stolbovskaya.controller.command.Command;
import by.bsuir.stolbovskaya.controller.util.BookStringBuilder;
import by.bsuir.stolbovskaya.domain.Book;
import by.bsuir.stolbovskaya.service.BookService;
import by.bsuir.stolbovskaya.service.ServiceFactory;
import by.bsuir.stolbovskaya.service.exception.ServiceException;

public class GetBookCommand implements Command {

    @Override
    public String execute(String request) {
        String[] params = request.split(";");

        if (params.length < 3) {
            return "Arguments required: 3";
        }

        try {
            BookService bookService = ServiceFactory.getInstance().getBookService();
            if (bookService == null) {
                throw new ServiceException("Access denied");
            }
            Book book = bookService.getBook(params[0], params[1], Book.Type.valueOf(params[2]));
            if (book != null) {
                BookStringBuilder sb = new BookStringBuilder();
                return sb.buildString(book);
            }
            else {
                return "No such book";
            }
        } catch (ServiceException e) {
            return e.getMessage();
        }
    }
}
