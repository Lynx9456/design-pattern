/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern9_Bridge;

/**
 * @author ZhouYuhang
 * @version StringDisplayImpl.java, v 0.1 2025年01月21日 16:57 ZhouYuhang
 */
public class StringDisplayImpl extends DisplayImpl {

    private String str;
    private int width;

    public StringDisplayImpl(String str) {
        this.str = str;
        this.width=str.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.println("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}