/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory.listFactory;

import org.example.design.pattern8_AbstractFactory.factory.Item;
import org.example.design.pattern8_AbstractFactory.factory.Tray;

import java.util.Iterator;

/**
 * @author ZhouYuhang
 * @version ListTray.java, v 0.1 2025年01月21日 15:01 ZhouYuhang
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<li>\n");
        sb.append(caption + "\n");
        sb.append("<ul>\n");
        Iterator<Item> it = trayList.iterator();
        while (it.hasNext()) {
            Item item = it.next();
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}