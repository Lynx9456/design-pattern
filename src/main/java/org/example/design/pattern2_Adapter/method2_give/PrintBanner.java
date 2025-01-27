/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern2_Adapter.method2_give;

/**
 * @author ZhouYuhang
 * @version PrintBanner.java, v 0.1 2025年01月20日 10:56 ZhouYuhang
 */
public class PrintBanner extends Print{
    private Banner banner;

    public PrintBanner(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}