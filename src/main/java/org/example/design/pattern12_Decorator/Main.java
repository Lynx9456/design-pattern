/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern12_Decorator;

/**
 * 12、Decorator模式
 * 其实类似于递归，最里面一层(终止条件)就是stringDisplay(被装饰对象),外面的层层Border子类都是装饰对象(层层递归)
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月22日 13:44 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();

        Display b4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay(" 你好， 世界。")
                                        ),
                                        '*'
                                )
                        )
                ),
                '/'
        );
        b4.show();
    }
}