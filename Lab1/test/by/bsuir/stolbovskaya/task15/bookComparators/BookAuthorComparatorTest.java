package by.bsuir.stolbovskaya.task15.bookComparators;

import by.bsuir.stolbovskaya.task12.book.Book;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class BookAuthorComparatorTest {

    @Test
    public void compare() {
        BookAuthorComparator bookAuthorComparator = new BookAuthorComparator();

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> sortedBooks = new ArrayList<>();

        Book book1 = new Book("title_1", "author_1", 1);
        Book book2 = new Book("title_2", "author_2", 2);
        Book book3 = new Book("title_3", "author_3", 3);

        sortedBooks.add(book1);
        sortedBooks.add(book2);
        sortedBooks.add(book3);

        books.add(book3);
        books.add(book1);
        books.add(book2);

        books.sort(bookAuthorComparator);
        Assertions.assertEquals(0, bookAuthorComparator.compare(book1, book1));
        Assertions.assertTrue(bookAuthorComparator.compare(book1, book2) < 0);
        Assertions.assertTrue(bookAuthorComparator.compare(book3, book2) > 0);
        Assertions.assertEquals(sortedBooks, books);
    }
}