/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory.tableFactory;

import org.example.design.pattern8_AbstractFactory.factory.Tray;

/**
 * @author ZhouYuhang
 * @version TableTray.java, v 0.1 2025年01月21日 15:41 ZhouYuhang
 */
public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}