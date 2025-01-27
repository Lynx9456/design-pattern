/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern7_Builder;

/**
 * 7、Builder模式
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月21日 10:56 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        String builderName="plain";
//        String builderName="html";
        if (builderName.equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (builderName.equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println(fileName + "文件编写完成。");
        } else {
            usage();
        }
    }

    private static void usage() {
        System.out.println("Usage: java Main plain  编写纯文本文档");
        System.out.println("Usage: java Main html   编写 HTML文档");
    }
}