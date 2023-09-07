package gof23;


import com.example.gof23.iterator.Book;
import com.example.gof23.iterator.BookShelf;
import com.example.gof23.iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("鬼吹灯"));
        bookShelf.appendBook(new Book("盗墓笔记"));
        bookShelf.appendBook(new Book("庆余年"));
        bookShelf.appendBook(new Book("庆余年2"));
        bookShelf.appendBook(new Book("十万个为什么"));
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}
