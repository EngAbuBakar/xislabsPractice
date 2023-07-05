package DesignPattern;

public class Book {
    // make a private constructor
    // make private static field
    // create object by method

    private static Book book;
    private Book()
    {

    }
    // Lazy way of creating object
    public static Book getBook()
    {
        synchronized (Book.class) {
            if (book == null) {
                book = new Book();
            }
        }
        return book;

    }
}
