/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory.listFactory;

import org.example.design.pattern8_AbstractFactory.factory.Link;

/**
 * @author ZhouYuhang
 * @version ListLink.java, v 0.1 2025年01月21日 14:59 ZhouYuhang
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}