/*
 * Ant Group
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 秋涩
 * @version UserSimilaritySorter.java, v 0.1 2024年06月13日 23:19 秋涩
 */
public class UserSimilaritySorter {
    public static void main(String[] args) {
        List<UserSimilarityEntry> entries = new ArrayList<>();

        // 假设已经从某个源头获取到了用户相似度数据，并创建了UserSimilarityEntry实例
        entries.add(new UserSimilarityEntry("user1", 0.85));
        entries.add(new UserSimilarityEntry("user2", 0.92));
        entries.add(new UserSimilarityEntry("user3", 0.78));

        // 直接对列表进行排序
        Collections.sort(entries);
        //排序方式2
        List<UserSimilarityEntry> collect = entries.stream().sorted(new Comparator<UserSimilarityEntry>() {
            @Override
            public int compare(UserSimilarityEntry o1, UserSimilarityEntry o2) {
                return Double.compare(o1.getSimilarity(), o2.getSimilarity());
            }
        }).collect(Collectors.toList());

        // 打印排序后的结果
        for (UserSimilarityEntry entry : entries) {
            System.out.println("User ID: " + entry.getUserId() + ", Similarity: " + entry.getSimilarity());
        }
    }
}