package by.bsuir.stolbovskaya.controller.command.impl;

import by.bsuir.stolbovskaya.controller.command.Command;
import by.bsuir.stolbovskaya.controller.util.BookStringBuilder;
import by.bsuir.stolbovskaya.domain.Book;
import by.bsuir.stolbovskaya.service.BookService;
import by.bsuir.stolbovskaya.service.ServiceFactory;
import by.bsuir.stolbovskaya.service.exception.ServiceException;

import java.util.List;

public class GetAllBooksCommand implements Command {
    @Override
    public String execute(String request) {
        try {
            BookService bookService = ServiceFactory.getInstance().getBookService();
            if (bookService == null) {
                throw new ServiceException("Access denied");
            }

            List<Book> books = bookService.getAll();
            if (books != null) {
                BookStringBuilder sb = new BookStringBuilder();
                return sb.buildString(books);
            }
            else {
                return "There are no books. Maybe you want to add some? :)";
            }
        } catch (ServiceException e) {
            return e.getMessage();
        }
    }
}
