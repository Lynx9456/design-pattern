/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern17_Observer;

/**
 * 17、Observer模式(观察者模式)
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月24日 14:49 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}