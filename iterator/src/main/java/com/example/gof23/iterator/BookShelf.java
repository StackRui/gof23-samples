package com.example.gof23.iterator;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate<Book> {
    private final List<Book> books = new ArrayList<>();

    @Getter
    private int length;

    public void appendBook(Book book) {
        this.books.add(book);
        this.length = length + 1;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
