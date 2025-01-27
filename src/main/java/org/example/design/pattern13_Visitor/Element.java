/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern13_Visitor;

/**
 * @author ZhouYuhang
 * @version Element.java, v 0.1 2025年01月22日 17:02 ZhouYuhang
 */
public interface Element {
    void accept(Visitor v);
}