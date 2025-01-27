/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern3_TemplateMethod;

/**
 * 3、TemplateMethod模式
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月20日 14:07 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d3 = new StringDisplay("你好， 世界。");
        d1.display();
        d2.display();
        d3.display();
    }
}