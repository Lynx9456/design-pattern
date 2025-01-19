/*
 * Ant Group
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package org.example;

/**
 * @author 秋涩
 * @version UserSimilarityEntry.java, v 0.1 2024年06月13日 23:18 秋涩
 */
public class UserSimilarityEntry implements Comparable<UserSimilarityEntry>{
    private String userId;
    private double similarity;

    public UserSimilarityEntry() {
    }

    public UserSimilarityEntry(String userId, double similarity) {
        this.userId = userId;
        this.similarity = similarity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }

    @Override
    public int compareTo(UserSimilarityEntry other) {
        return Double.compare(this.getSimilarity(),other.getSimilarity());
    }
}