/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern4_FactoryMethod.idcard;

import org.example.design.pattern4_FactoryMethod.framework.Product;

/**
 * @author ZhouYuhang
 * @version IDCard.java, v 0.1 2025年01月20日 14:55 ZhouYuhang
 */
public class IDCard extends Product {

    private String owner;

    /*
    没有用public IDCard的构造方法，是因为希望使得idcard包外的类无法new出IDCard类的实例。
    这样就可以强迫外部必须通过IDCardFactory来生成IDCard的实例。
    比如在Main类中，就不能通过IDCard idcard = new IDCard("test")的方式生成IDCard实例。
     */
    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

    public String getOwner() {
        return owner;
    }
}