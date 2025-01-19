/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern1_iterator;

import org.example.design.pattern1_iterator.impl.BookShelf;

/**
 * Iterator模式
 *
 * @author 秋涩
 * @version Main.java, v 0.1 2025年01月19日 20:30 秋涩
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book1"));
        bookShelf.appendBook(new Book("book2"));
        bookShelf.appendBook(new Book("book3"));
        bookShelf.appendBook(new Book("book4"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}