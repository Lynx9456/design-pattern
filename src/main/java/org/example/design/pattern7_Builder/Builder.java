/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern7_Builder;

/**
 * @author ZhouYuhang
 * @version Builder.java, v 0.1 2025年01月21日 10:40 ZhouYuhang
 */
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}