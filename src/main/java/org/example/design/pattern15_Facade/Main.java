/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern15_Facade;

import org.example.design.pattern15_Facade.pagemaker.PageMaker;

/**
 * 15、Facade模式
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月23日 11:33 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}