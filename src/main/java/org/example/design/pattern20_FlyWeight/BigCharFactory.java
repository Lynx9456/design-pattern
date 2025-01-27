/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern20_FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhouYuhang
 * @version BigCharFactory.java, v 0.1 2025年01月27日 15:09 ZhouYuhang
 */
public class BigCharFactory {

    private static Map<String, BigChar> pool = new HashMap<>();

    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    ;

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = pool.get("" + charName);
        if (bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put("" + charName, bigChar);
        }
        return bigChar;
    }
}