/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern13_Visitor;

/**
 * @author ZhouYuhang
 * @version Visitor.java, v 0.1 2025年01月22日 16:59 ZhouYuhang
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}