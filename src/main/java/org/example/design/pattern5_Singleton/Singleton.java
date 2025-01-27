/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern5_Singleton;

/**
 * @author ZhouYuhang
 * @version Singleton.java, v 0.1 2025年01月20日 16:25 ZhouYuhang
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}