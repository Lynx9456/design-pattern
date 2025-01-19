/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern1_iterator.impl;

import org.example.design.pattern1_iterator.Aggregate;
import org.example.design.pattern1_iterator.Book;
import org.example.design.pattern1_iterator.Iterator;

/**
 * @author 秋涩
 * @version BookShelf.java, v 0.1 2025年01月19日 20:01 秋涩
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        if (index >= this.last) {
            return null;
        }
        return books[index];
    }

    public void appendBook(Book book) {
        if (this.last >= books.length) {
            return;
        }
        books[last] = book;
        last++;
    }

    public int getLength() {
        return books.length;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}