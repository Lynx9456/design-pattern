/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern2_Adapter.method1_extends.impl;

import org.example.design.pattern2_Adapter.method1_extends.Banner;
import org.example.design.pattern2_Adapter.method1_extends.Print;

/**
 * @author ZhouYuhang
 * @version PrintBanner.java, v 0.1 2025年01月20日 10:33 ZhouYuhang
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}