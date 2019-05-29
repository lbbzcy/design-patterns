package com.lbbzcy.design.patterns.iterator;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-23 14:14
 * @Copyright: asiainfo
 */
public class BookShelf implements Aggregate {

    private ArrayList<Book> books;
    private int last = 0;
    public BookShelf(int maxSize) {
        this.books = new ArrayList<>(maxSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
