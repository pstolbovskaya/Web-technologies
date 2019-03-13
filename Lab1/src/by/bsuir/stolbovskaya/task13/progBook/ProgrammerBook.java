package by.bsuir.stolbovskaya.task13.progBook;

import by.bsuir.stolbovskaya.task12.book.Book;
import java.util.Objects;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    @Override
    public boolean equals(Object object) {
        ProgrammerBook programmerBook;

        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }

        if (object == this) {
            return true;
        }

        programmerBook = (ProgrammerBook) object;
        return super.equals(object) && Objects.equals(programmerBook.language, language)
                && (programmerBook.level == level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return super.toString() + ", language: " + language + ", level: " + level;
    }

    public ProgrammerBook(String ntitle, String nauthor, int nprice, String newLanguage, int newLevel) {
        super(ntitle, nauthor, nprice);
        if (newLanguage == null || newLevel < 0) {
            throw new IllegalArgumentException();
        }

        language = newLanguage;
        level = newLevel;
    }
}