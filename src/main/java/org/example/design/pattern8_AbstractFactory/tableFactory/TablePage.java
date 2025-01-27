/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory.tableFactory;

import org.example.design.pattern8_AbstractFactory.factory.Page;

/**
 * @author ZhouYuhang
 * @version TablePage.java, v 0.1 2025年01月21日 15:41 ZhouYuhang
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}