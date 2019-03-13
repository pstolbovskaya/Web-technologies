package by.bsuir.stolbovskaya.task13.app;

import by.bsuir.stolbovskaya.task13.progBook.ProgrammerBook;

public class App {

    public static void main(String[] args) {

        ProgrammerBook book = new ProgrammerBook("title", "author", 1, "C", 1);
        System.out.print(book.toString() + '\n');

    }
}
