package by.bsuir.stolbovskaya.task14.app;

import by.bsuir.stolbovskaya.task14.book.Book;

public class App {


    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("title", "author", 123);
        Book book2 = book.clone();

        System.out.print(book2.compareTo(book));

        Book book3 = new Book("title", "author", 1, "124");
        Book book4 = new Book("title", "author", 1, "123");

        System.out.print(book3.compareTo(book4));
    }

}
