/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern21_Proxy;

/**
 * @author ZhouYuhang
 * @version Printable.java, v 0.1 2025年01月27日 16:35 ZhouYuhang
 */
public interface Printable {
    void setPrintName(String name);

    String getPrintName();

    void print(String str);
}