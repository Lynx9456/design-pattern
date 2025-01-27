/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern20_FlyWeight;

/**
 * 20、FlyWeight模式(享元模式)
 * 通过尽量共享实例来避免new出实例，节省内存空间
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月27日 11:58 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        BigString bigString = new BigString("1212123");
        bigString.print();
    }
}