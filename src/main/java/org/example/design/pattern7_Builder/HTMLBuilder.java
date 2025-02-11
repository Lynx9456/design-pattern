/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern7_Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ZhouYuhang
 * @version HTMLBuilder.java, v 0.1 2025年01月21日 10:50 ZhouYuhang
 */
public class HTMLBuilder extends Builder{

    private  String fileName;

    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        fileName=title+".html";
        try {
            writer=new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>"+title+"</title></head><body>");
        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>"+str+"</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>"+items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult(){
        return fileName;
    }
}