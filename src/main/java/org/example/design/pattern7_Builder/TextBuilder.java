/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern7_Builder;

/**
 * @author ZhouYuhang
 * @version TextBuilder.java, v 0.1 2025年01月21日 10:44 ZhouYuhang
 */
public class TextBuilder extends Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        sb.append("===========================\n");
        sb.append("[" + title + "]\n");
        sb.append("\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("【" + str + "\n");
        sb.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            sb.append("  ` " + items[i] + "\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("===========================\n");
    }

    public String getResult() {
        return sb.toString();
    }
}