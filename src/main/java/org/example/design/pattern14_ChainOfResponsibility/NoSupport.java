/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern14_ChainOfResponsibility;

/**
 * @author ZhouYuhang
 * @version NoSupport.java, v 0.1 2025年01月22日 18:09 ZhouYuhang
 */

public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}