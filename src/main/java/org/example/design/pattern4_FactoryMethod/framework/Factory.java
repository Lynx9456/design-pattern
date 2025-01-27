/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern4_FactoryMethod.framework;

/**
 * @author ZhouYuhang
 * @version Factory.java, v 0.1 2025年01月20日 14:49 ZhouYuhang
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);

}