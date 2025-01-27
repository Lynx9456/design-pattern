/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern13_Visitor;

import java.util.Iterator;

/**
 * @author ZhouYuhang
 * @version Entry.java, v 0.1 2025年01月22日 17:02 ZhouYuhang
 */
public abstract class Entry implements Element{

    public abstract String getName();

    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public Iterator iterator()throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName()+"("+getSize()+")";
    }
}