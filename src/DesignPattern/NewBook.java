package DesignPattern;

public class NewBook {
    private static  NewBook newBook=new NewBook();
    public static NewBook getNewBook()
    {
        return newBook;
    }
}
