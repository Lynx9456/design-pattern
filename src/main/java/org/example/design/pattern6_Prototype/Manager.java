/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern6_Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhouYuhang
 * @version Manager.java, v 0.1 2025年01月20日 17:55 ZhouYuhang
 */
public class Manager {
    private Map<String, Product> showcase;

    public Manager() {
        showcase = new HashMap<>();
    }

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        if (!showcase.containsKey(protoName)) {
            return null;
        }
        Product p = showcase.get(protoName);
        return p.createClone();
    }
}