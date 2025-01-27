/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern21_Proxy;

/**
 * 21、Proxy模式(代理模式)
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月27日 15:57 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + p.getPrintName() + "。");
        p.setPrintName("Bob");
        System.out.println("现在的名字是" + p.getPrintName() + "。");
        p.print("Hello, world.");
    }
}