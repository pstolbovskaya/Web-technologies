package by.bsuir.stolbovskaya.task14.book;

public class Book implements Comparable<Book>, Cloneable{

    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

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

    public String GetIsbn() {
        return isbn;
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
        isbn = "12345";
    }

    public Book(String newTitle, String newAuthor, int newPrice, String nisbn) {
        if (newTitle == null || newAuthor == null || newPrice < 0 || nisbn == null){
            throw new IllegalArgumentException();
        }

        title = newTitle;
        author = newAuthor;
        price = newPrice;
        isbn = nisbn;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();

        clone.title = title;
        clone.author = author;
        clone.price = price;
        return clone;
    }

    @Override
    public int compareTo(Book book) {

        if (book == null) {
            throw new NullPointerException();
        }
        String tempisbn = book.GetIsbn().replace("X", "10").replace("-", "");
        String currisbn = isbn.replace("X", "10").replace("-", "");

        return currisbn.compareTo(tempisbn);
    }
}