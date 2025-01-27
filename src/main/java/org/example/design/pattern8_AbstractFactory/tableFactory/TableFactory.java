/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory.tableFactory;

import org.example.design.pattern8_AbstractFactory.factory.Factory;
import org.example.design.pattern8_AbstractFactory.factory.Link;
import org.example.design.pattern8_AbstractFactory.factory.Page;
import org.example.design.pattern8_AbstractFactory.factory.Tray;

/**
 * @author ZhouYuhang
 * @version TableFactory.java, v 0.1 2025年01月21日 15:40 ZhouYuhang
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}