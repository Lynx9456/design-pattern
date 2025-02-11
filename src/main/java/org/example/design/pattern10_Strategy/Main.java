/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern10_Strategy;

/**
 * 10、Strategy模式(策略模式)
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月21日 18:02 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        int seed1 = 314;
        int seed2 = 15;
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total results:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}