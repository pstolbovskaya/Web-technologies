package by.bsuir.stolbovskaya.task12.book;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void hashCode1() {

        Book book = new Book("title", "author", 1);
        Book book1 = new Book("t", "a", 1);

        assertNotEquals(book1, book.hashCode());
    }

    @Test
    public void equals1() {

        Book book = new Book("title", "author", 1);
        Book book1 = new Book("t", "a", 1);

        assertFalse(book.equals(book1));
    }

    @Test
    public void equals2() {

        Book book = new Book("title", "author", 1);

        assertTrue(book.equals(book));
    }
}