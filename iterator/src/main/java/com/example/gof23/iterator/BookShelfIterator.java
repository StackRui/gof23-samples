package com.example.gof23.iterator;

public class BookShelfIterator implements Iterator<Book> {
    private final BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public Book next() {
        Book book = this.bookShelf.getBookAt(index);
        index++;
        return book;
    }

    @Override
    public boolean hasNext() {
        return index < this.bookShelf.getLength();
    }
}
