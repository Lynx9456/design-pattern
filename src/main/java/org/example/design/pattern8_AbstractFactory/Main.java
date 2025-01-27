/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern8_AbstractFactory;

import org.example.design.pattern8_AbstractFactory.factory.Factory;
import org.example.design.pattern8_AbstractFactory.factory.Link;
import org.example.design.pattern8_AbstractFactory.factory.Page;
import org.example.design.pattern8_AbstractFactory.factory.Tray;

/**
 * 8、AbstractFactory模式(抽象工厂模式)
 *
 * @author ZhouYuhang
 * @version Main.java, v 0.1 2025年01月21日 11:42 ZhouYuhang
 */
public class Main {
    public static void main(String[] args) {
        String className = "org.example.design.pattern8_AbstractFactory.listFactory.ListFactory";
        Factory factory = Factory.getFactory(className);
        Link people = factory.createLink("人民日报", "http://人民日报.com");
        Link gmw = factory.createLink("光明日报", "http://光明日报.com");
        Link us_yahoo = factory.createLink("Yahoo!", "http://Yahoo.com");
        Link ch_yahoo = factory.createLink("Yahho!China", "http://Yahoo.China.com");
        Link excite = factory.createLink("Excite", "http://Excite.com");
        Link google = factory.createLink("Google", "http://Google.com");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(ch_yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "Lynx");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}