/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern20_FlyWeight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ZhouYuhang
 * @version BigChar.java, v 0.1 2025年01月27日 15:02 ZhouYuhang
 */
public class BigChar {
    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/org/example/design/pattern20_FlyWeight/prop/big" + charName + ".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontData = buf.toString();
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}