package by.bsuir.stolbovskaya.task14.book;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void compareToTest() {
        Book book = new Book("t", "a", 1);

        assertEquals(0, book.compareTo(book));
    }

    @Test
    public void compareToTest2() throws CloneNotSupportedException {
        Book book = new Book("t", "a", 1);
        Book book2 = book.clone();

        assertEquals(0, book.compareTo(book2));
    }
}