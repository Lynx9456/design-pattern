/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern9_Bridge;

/**
 * @author ZhouYuhang
 * @version CountDisplay.java, v 0.1 2025年01月21日 16:58 ZhouYuhang
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}