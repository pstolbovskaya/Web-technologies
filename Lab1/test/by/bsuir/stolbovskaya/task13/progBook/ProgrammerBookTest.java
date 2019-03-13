package by.bsuir.stolbovskaya.task13.progBook;

import by.bsuir.stolbovskaya.task12.book.Book;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerBookTest {

    @Test
    public void hashCode1() {
        ProgrammerBook book = new ProgrammerBook("title", "author", 1, "C", 1);
        ProgrammerBook book1 = new ProgrammerBook("none", "none", 1, "C", 1);

        assertNotEquals(book.hashCode(), book1.hashCode());
    }

    @Test
    public void hashCode2() {
        ProgrammerBook book = new ProgrammerBook("title", "author", 1, "C", 1);
        Book book1 = new ProgrammerBook("none", "none", 1, "C", 1);

        assertNotEquals(book.hashCode(), book1.hashCode());
    }

}