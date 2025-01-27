/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern15_Facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ZhouYuhang
 * @version PageMaker.java, v 0.1 2025年01月23日 13:55 ZhouYuhang
 */
public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddr, String fileName) {
        try {
            Properties mailProp = Database.getProperties("src/main/java/org/example/design/pattern15_Facade/maildata");
            String userName = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + userName + "'s page!");
            writer.paragraph(userName + "欢迎来到" + userName + "的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailAddr, userName);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddr + "(" + userName + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}