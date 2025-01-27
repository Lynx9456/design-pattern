/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern2_Adapter.method2_give;

/**
 * 2.2 适配器模式中的第二种（对象适配器模式:使用委托的适配器）
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月20日 10:46 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}