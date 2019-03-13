package by.bsuir.stolbovskaya.task15.bookComparators;

import by.bsuir.stolbovskaya.task12.book.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {

        if ((book1 == null) || (book2 == null)) {
            throw new NullPointerException();
        }

        return Integer.compare(book1.GetPrice(), book2.GetPrice());
    }
}
