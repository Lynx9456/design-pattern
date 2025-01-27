/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern4_FactoryMethod;

import org.example.design.pattern4_FactoryMethod.framework.Factory;
import org.example.design.pattern4_FactoryMethod.framework.Product;
import org.example.design.pattern4_FactoryMethod.idcard.IDCardFactory;

/**
 * 4、FactoryMethod模式
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月20日 15:07 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();

    }
}