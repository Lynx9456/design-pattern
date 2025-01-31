/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern23_Interpreter;

/**
 * @author 秋涩
 * @version Node.java, v 0.1 2025年01月31日 13:19 秋涩
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}