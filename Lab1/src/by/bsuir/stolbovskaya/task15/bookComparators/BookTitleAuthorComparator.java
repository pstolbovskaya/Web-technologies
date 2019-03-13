package by.bsuir.stolbovskaya.task15.bookComparators;

import by.bsuir.stolbovskaya.task12.book.Book;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

    Comparator<Book> titleAuthorComparator;

    @Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Both books shouldn't be null");
        }

        return titleAuthorComparator.compare(book1, book2);
    }

    public BookTitleAuthorComparator() {
        titleAuthorComparator = new BookTitleComparator().thenComparing(new BookAuthorComparator());
    }
}
