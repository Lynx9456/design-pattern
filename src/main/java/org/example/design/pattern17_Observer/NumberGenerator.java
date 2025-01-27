/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern17_Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ZhouYuhang
 * @version NumberGenerator.java, v 0.1 2025年01月24日 21:40 ZhouYuhang
 */
public abstract class NumberGenerator {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    //向Observer发出通知
    public void notifyObservers() {
        Iterator<Observer> it = observerList.iterator();
        while (it.hasNext()) {
            Observer observer = it.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}