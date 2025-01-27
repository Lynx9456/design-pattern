/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory.factory;

/**
 * @author ZhouYuhang
 * @version Item.java, v 0.1 2025年01月21日 14:43 ZhouYuhang
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}