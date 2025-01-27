/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern12_Decorator;

/**
 * @author ZhouYuhang
 * @version SideBorder.java, v 0.1 2025年01月22日 14:58 ZhouYuhang
 */
public class SideBorder extends Border{

    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar+display.getRowText(row)+borderChar;
    }
}