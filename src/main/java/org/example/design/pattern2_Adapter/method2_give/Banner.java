/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern2_Adapter.method2_give;

/**
 * @author ZhouYuhang
 * @version Banner.java, v 0.1 2025年01月20日 10:30 ZhouYuhang
 */
public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen() {
        System.out.println("(" + str + ")");
    }

    public void showWithAster() {
        System.out.println("*" + str + "*");
    }
}