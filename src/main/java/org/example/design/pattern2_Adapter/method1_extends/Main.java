/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern2_Adapter.method1_extends;

import org.example.design.pattern2_Adapter.method1_extends.impl.PrintBanner;

/**
 * 2.1 适配器模式中的第一种（类适配器模式:使用继承的适配器）
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月20日 10:34 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}