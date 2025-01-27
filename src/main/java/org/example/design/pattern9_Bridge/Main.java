/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern9_Bridge;

/**
 * 9、Bridge模式(桥梁模式)
 * 该模式的作用是将【类的功能层次结构】和【类的实现层次结构】进行连接:
 * 1、功能表示需要有哪些功能方法,eg.做饭、洗衣服等;
 * 2、实现表示需要有不同的几套实现,eg.做饭怎么做:红烧、清蒸、爆炒)
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月21日 16:14 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

    }
}