/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern6_Prototype;

/**
 * @author ZhouYuhang
 * @version Product.java, v 0.1 2025年01月20日 17:53 ZhouYuhang
 */
public interface Product extends Cloneable {

    void use(String str);

    Product createClone();
}