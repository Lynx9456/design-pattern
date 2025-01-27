/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern9_Bridge;

/**
 * @author ZhouYuhang
 * @version DisplayImpl.java, v 0.1 2025年01月21日 16:57 ZhouYuhang
 */
public abstract class DisplayImpl {
    public abstract void rawOpen();

    public abstract void rawPrint();

    public abstract void rawClose();
}