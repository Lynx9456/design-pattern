/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern12_Decorator;

/**
 * @author ZhouYuhang
 * @version StringDisplay.java, v 0.1 2025年01月22日 14:33 ZhouYuhang
 */
public class StringDisplay extends Display {

    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public int getColumns() {
        return str.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return str;
        } else {
            return null;
        }
    }
}