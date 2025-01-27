/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern5_Singleton;

import java.util.Objects;

/**
 * 5、Singleton模式(单例模式)
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月20日 16:27 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start...");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (Objects.equals(obj1, obj2)) {
            System.out.println("obj1和obj2是相同的实例");
        } else {
            System.out.println("obj1和obj2是不同的实例");
        }
        System.out.println("End...");
    }
}