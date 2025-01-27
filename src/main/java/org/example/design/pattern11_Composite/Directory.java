/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern11_Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ZhouYuhang
 * @version Directory.java, v 0.1 2025年01月22日 12:02 ZhouYuhang
 */
public class Directory extends Entry {

    private String name;

    private List<Entry> directoryList;

    public Directory(String name) {
        this.name = name;
        this.directoryList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        Iterator<Entry> it = directoryList.iterator();
        int sum = 0;
        while (it.hasNext()) {
            Entry entry = it.next();
            sum += entry.getSize();
        }
        return sum;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
        Iterator<Entry> it = directoryList.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.printList(prefix + "/" + this.name);
        }
    }

    @Override
    public void add(Entry entry) throws FileTreatmentException {
        this.directoryList.add(entry);
    }
}