/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern21_Proxy;

/**
 * @author ZhouYuhang
 * @version PrinterProxy.java, v 0.1 2025年01月27日 16:45 ZhouYuhang
 */
public class PrinterProxy implements Printable {

    private String name;

    private Printer real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrintName(String name) {
        if (real != null) {
            real.setPrintName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String str) {
        realize();
        real.print(str);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}