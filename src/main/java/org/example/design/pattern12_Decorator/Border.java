/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern12_Decorator;

/**
 * @author ZhouYuhang
 * @version Border.java, v 0.1 2025年01月22日 14:57 ZhouYuhang
 */
public abstract class Border extends Display{
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}