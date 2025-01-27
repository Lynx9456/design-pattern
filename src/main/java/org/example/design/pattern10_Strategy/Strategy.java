/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern10_Strategy;

/**
 * @author ZhouYuhang
 * @version Strategy.java, v 0.1 2025年01月21日 22:59 ZhouYuhang
 */
public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}