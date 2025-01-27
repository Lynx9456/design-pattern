/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern9_Bridge;

/**
 * @author ZhouYuhang
 * @version Display.java, v 0.1 2025年01月21日 16:57 ZhouYuhang
 */
public class Display {
    private DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    public void open(){
        displayImpl.rawOpen();
    }

    public void print(){
        displayImpl.rawPrint();
    }

    public void close(){
        displayImpl.rawClose();
    }

    public void display(){
        open();
        print();
        close();
    }
}