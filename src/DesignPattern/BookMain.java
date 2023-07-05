package DesignPattern;

public class BookMain {
    public static void main(String[] args) {

       Book book1= Book.getBook();
        System.out.println(" Hash code of the book 1st time object is: "+book1.hashCode());
        Book book2=Book.getBook();
        System.out.println("Hash code of the book 2nd time  object is: "+book2.hashCode());

        System.out.println(NewBook.getNewBook().hashCode());
        System.out.println(NewBook.getNewBook().hashCode());

    }
}
