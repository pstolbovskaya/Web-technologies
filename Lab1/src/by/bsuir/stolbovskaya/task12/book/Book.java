package by.bsuir.stolbovskaya.task12.book;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int price;
    private static int edition;


    @Override
    public boolean equals(Object object) {

        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }
        if (object == this) {
            return true;
        }

        Book book = (Book) object;
        return Objects.equals(book.GetTitle(), title) && Objects.equals(book.GetAuthor(), author)
                && (price == book.GetPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, edition);
    }


    @Override
    public String toString() {
        return super.toString() + " title: " + title + ", author: " + author + ", price: " + price + ", edition: "
                + edition;
    }

    public static void SetEdition(int edition) {
        if (edition <= 0) {
            throw new IllegalArgumentException();
        }

        Book.edition = edition;
    }

    public String GetTitle() {
        return title;
    }

    public String GetAuthor() {
        return author;
    }

    public int GetPrice() {
        return price;
    }

    public static int GetEdition() {
        return edition;
    }

    public Book(String newTitle, String newAuthor, int newPrice) {
        if (newTitle == null || newAuthor == null || newPrice < 0){
            throw new IllegalArgumentException();
        }

        title = newTitle;
        author = newAuthor;
        price = newPrice;
    }
}