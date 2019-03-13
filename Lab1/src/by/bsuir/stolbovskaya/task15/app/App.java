package by.bsuir.stolbovskaya.task15.app;

import by.bsuir.stolbovskaya.task12.book.Book;
import by.bsuir.stolbovskaya.task15.bookComparators.BookAuthorComparator;
import by.bsuir.stolbovskaya.task15.bookComparators.BookAuthorTitleComparator;

import java.util.ArrayList;

public class App {

    private static String OutBooks(ArrayList<Book> books){
        String res = "";

        for (Book book: books) {
            res+= book.toString() + '\n';
        }

        return res;
    }
    public static void main(String[] args){

        BookAuthorComparator bookAuthorComparator = new BookAuthorComparator();

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("title_5", "author_1", 1));
        books.add(new Book("title_2", "author_2", 2));
        books.add(new Book("title_3", "author_3", 3));
        books.add(new Book("title_4", "author_4", 4));
        books.add(new Book("title_4", "author_2", 1));
        books.add(new Book("title_1", "author_1", 1));
        books.add(new Book("title_5", "author_5", 5));
        books.add(new Book("title_6", "author_6", 6));

        books.sort(bookAuthorComparator);

        System.out.print(OutBooks(books));
        System.out.print('\n' + "=============" + '\n');


        BookAuthorTitleComparator bookAuthorTitleComparator = new BookAuthorTitleComparator();

        books.sort(bookAuthorTitleComparator);
        System.out.print(OutBooks(books));
    }
}
