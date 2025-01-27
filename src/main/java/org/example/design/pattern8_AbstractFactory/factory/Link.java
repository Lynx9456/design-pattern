/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory.factory;

/**
 * @author ZhouYuhang
 * @version Linke.java, v 0.1 2025年01月21日 14:46 ZhouYuhang
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}