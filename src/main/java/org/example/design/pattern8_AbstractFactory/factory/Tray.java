/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhouYuhang
 * @version Tray.java, v 0.1 2025年01月21日 14:47 ZhouYuhang
 */
public abstract class Tray extends Item {

    protected List<Item> trayList = new ArrayList<>();


    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        trayList.add(item);
    }
}