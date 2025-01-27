/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory.tableFactory;

import org.example.design.pattern8_AbstractFactory.factory.Link;

/**
 * @author ZhouYuhang
 * @version TableLink.java, v 0.1 2025年01月21日 15:41 ZhouYuhang
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}