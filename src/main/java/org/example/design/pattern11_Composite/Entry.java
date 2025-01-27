/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern11_Composite;

/**
 * @author ZhouYuhang
 * @version Entry.java, v 0.1 2025年01月22日 11:58 ZhouYuhang
 */
public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    public abstract void printList(String prefix);

    public void add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}