package by.bsuir.stolbovskaya.task12.app;

import by.bsuir.stolbovskaya.task12.book.Book;

public class App {

    public static void main(String[] args) {

        Book book = new Book("title", "author", 1);
        System.out.print(book.toString() + '\n');

        System.out.print(book.hashCode() + '\n');

        System.out.print('\n');

        Book.SetEdition(12);
        System.out.print(book.toString() + '\n');
    }

}
