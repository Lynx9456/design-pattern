/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern1_iterator.impl;

import org.example.design.pattern1_iterator.Book;
import org.example.design.pattern1_iterator.Iterator;

/**
 * @author 秋涩
 * @version BookShelfIterator.java, v 0.1 2025年01月19日 20:23 秋涩
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}