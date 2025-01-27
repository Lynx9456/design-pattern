/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern13_Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ZhouYuhang
 * @version Directory.java, v 0.1 2025年01月22日 16:59 ZhouYuhang
 */
public class Directory extends Entry{

    private String name;

    private List<Entry>dirList;

    public Directory(String name) {
        this.name = name;
        dirList=new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size=0;
        Iterator<Entry> it = dirList.iterator();
        while (it.hasNext()){
            Entry entry = it.next();
            size+=entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        dirList.add(entry);
        return this;
    }

    @Override
    public Iterator iterator() throws FileTreatmentException {
        return dirList.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}