/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern23_Interpreter;

import java.util.StringTokenizer;

/**
 * @author 秋涩
 * @version Context.java, v 0.1 2025年01月31日 13:18 秋涩
 */
public class Context {

    private StringTokenizer tokenizer;

    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public String currentToken() {
        return currentToken;
    }

    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning:" + token + " is expected, but " + currentToken + " is found.");
        }
        nextToken();
    }

    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }
        return number;
    }
}