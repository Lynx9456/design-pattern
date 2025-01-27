/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern14_ChainOfResponsibility;

/**
 * @author ZhouYuhang
 * @version OddSupport.java, v 0.1 2025年01月22日 18:12 ZhouYuhang
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}