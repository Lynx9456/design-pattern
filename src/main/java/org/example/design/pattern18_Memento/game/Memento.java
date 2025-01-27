/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern18_Memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhouYuhang
 * @version Memento.java, v 0.1 2025年01月26日 20:12 ZhouYuhang
 */
public class Memento {
    int money;
    List<String> fruits;

    Memento(int money) {
        this.money = money;
        fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public List<String> getFruits() {
        return fruits;
    }
}