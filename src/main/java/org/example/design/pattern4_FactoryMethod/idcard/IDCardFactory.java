/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern4_FactoryMethod.idcard;

import org.example.design.pattern4_FactoryMethod.framework.Factory;
import org.example.design.pattern4_FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhouYuhang
 * @version IDCardFactory.java, v 0.1 2025年01月20日 14:55 ZhouYuhang
 */
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}