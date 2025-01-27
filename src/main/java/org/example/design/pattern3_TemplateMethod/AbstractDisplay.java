/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern3_TemplateMethod;

/**
 * @author ZhouYuhang
 * @version AbstractDisplay.java, v 0.1 2025年01月20日 13:58 ZhouYuhang
 */
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}